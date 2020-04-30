package com.lding.tshyserial.simplemvprxjavaretrofit.http.manager;

import android.util.Log;
import com.lding.tshyserial.simplemvprxjavaretrofit.application.AppProfile;
import com.lding.tshyserial.simplemvprxjavaretrofit.entity.GetListRsp;
import com.lding.tshyserial.simplemvprxjavaretrofit.http.ApiService;
import com.lding.tshyserial.simplemvprxjavaretrofit.utils.NetworkUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by tushuangxi 2019.1.26
 */
public class RetrofitManager {
    private static final String TAG = "RetrofitManager";
    //连接超时时间 5s
    private static final long CONNECT_TIMEOUT_SECOND = 5;
    //缓存有效期 1天
    private static final long CACHE_STALE_SECOND = 24 * 60 * 60;
    //缓存大小 100M
    private static final long CACHE_SIZE = 1024 * 1024 * 100;

    private static RetrofitManager mRetrofitManager = null;
    private static OkHttpClient mOkHttpClient;
    //APIService
    private  ApiService apiService;


    private RetrofitManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.SERVER_ADDRESS)//指定host       http://demo.api.ycy.com/demoapi/
                .client(getOkHttpClient())//指定OKHttpClient
                .addConverterFactory(GsonConverterFactory.create())//指定转换器，不同的网络请求API规范可自定义转换器
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();

        //创建APIService
        createAPIService(retrofit);


    }

    // 配置OkHttpClient
    private OkHttpClient getOkHttpClient() {
        if (mOkHttpClient == null) {
            synchronized (RetrofitManager.class) {
                if (mOkHttpClient == null) {
                    // OkHttpClient配置是一样的,静态创建一次即可
                    // 指定缓存路径,缓存大小100Mb
                    Cache cache = new Cache(new File(AppProfile.context.getCacheDir(), "HttpCache"),
                            CACHE_SIZE);

                    mOkHttpClient = new OkHttpClient.Builder().cache(cache)
                            .addNetworkInterceptor(mRewriteCacheControlInterceptor)
                            .addInterceptor(mRewriteCacheControlInterceptor)
                            .addInterceptor(mLoggingInterceptor)
                            .retryOnConnectionFailure(true)
                            .connectTimeout(CONNECT_TIMEOUT_SECOND, TimeUnit.SECONDS).build();
                }
            }
        }
        return mOkHttpClient;
    }

    public static RetrofitManager getInstance() {
        if (mRetrofitManager == null) {
            synchronized (RetrofitManager.class) {
                if (mRetrofitManager == null) {
                    mRetrofitManager = new RetrofitManager();
                }
            }
        }
        return mRetrofitManager;
    }

    /**
     * 根据网络状况获取缓存的策略
     */
    private String getCacheControl() {
        if (NetworkUtils.isConnected(AppProfile.context)) {
            //网络畅通情况下，设置max-age=0，表示不读取缓存，直接去服务器请求最新的数据
            return "max-age=0";
        } else {
            //网络不畅通情况下，读取缓存，并设置缓存时间为CACHE_STALE_SECOND（1天）
            return "only-if-cached, max-stale=" + CACHE_STALE_SECOND;
        }
    }

    // server响应头拦截器，用来配置缓存策略
    private Interceptor mRewriteCacheControlInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            if (!NetworkUtils.isConnected(AppProfile.context)) {
                request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build();
                Log.e(TAG, "no network");
            }
            Response originalResponse = chain.proceed(request);

            if (NetworkUtils.isConnected(AppProfile.context)) {
                //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
                String cacheControl = request.cacheControl().toString();
                return originalResponse.newBuilder()
                        .header("Cache-Control", cacheControl)
                        .header("Content-Type", "application/json")
                        .removeHeader("Pragma").build();
            } else {
                return originalResponse.newBuilder()
                        .header("Cache-Control", "public, only-if-cached," + CACHE_STALE_SECOND)
                        .removeHeader("Pragma").build();
            }

        }
    };

    // 打印json数据拦截器
    private Interceptor mLoggingInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            //request
            final Request request = chain.request();
            Log.v(TAG, "-----------------------开始打印请求数据-----------------------");
            if (request != null) {
                Log.w(TAG+"发送请求:", request.toString());
                Headers headers = request.headers();
                if (headers != null) {
                    Log.d(TAG, "headers : " + headers.toString());

                }
                RequestBody body = request.body();
                if (body != null) {
                    Buffer buffer = new Buffer();
                    body.writeTo(buffer);
                    String req = buffer.readByteString().utf8();
                    Log.e(TAG+"接收响应:", "body : " + req);
                }

            }
            Log.d(TAG, "-----------------------结束打印请求数据-----------------------");

            //response
            final Response response = chain.proceed(request);
            final ResponseBody responseBody = response.body();
            final long contentLength = responseBody.contentLength();
            BufferedSource source = responseBody.source();
            source.request(Long.MAX_VALUE); // Buffer the entire body.
            Buffer buffer = source.buffer();
            Charset charset = Charset.forName("UTF-8");
            MediaType contentType = responseBody.contentType();
            if (contentType != null) {
                try {
                    charset = contentType.charset(charset);
                } catch (UnsupportedCharsetException e) {
                    Log.d(TAG, "Couldn't decode the response body; charset is likely malformed.");
                    return response;

                }
            }
            if (contentLength != 0) {
                Log.d(TAG, "-----------------------开始打印响应数据-----------------------");
                Log.e(TAG+"响应数据:", buffer.clone().readString(charset));

                Log.d(TAG, "-----------------------结束打印响应数据-----------------------");
            }
            return response;

        }
    };

    //请求------------------------------------------------------------------------------------------
    //创建APIService
    private void createAPIService(Retrofit retrofit) {
        apiService = retrofit.create(ApiService.class);
        //TODO: 这里创建更多的APIService
    }
    public  Observable<GetListRsp> requestGetListRspList(Map<String, String> params) {
        return apiService.requestGetListRspList(params);
    }

}
