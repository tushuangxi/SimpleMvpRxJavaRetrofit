package com.lding.tshyserial.simplemvprxjavaretrofit.http;

import com.lding.tshyserial.simplemvprxjavaretrofit.entity.GetListRsp;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 工具类
 * Created by nangua on 2016/7/8.
 */
public interface ApiService {

    boolean isDebugHost = AppConfig.isDebug;
    //正式环境host
    String hostRelease = "http://api.zhuishushenqi.com";//正式接口

    //测试环境host
    String hostDebug = "http://api.zhuishushenqi.com";

    // 服务器域名  http://api.zhuishushenqi.com/cats/lv2/statistics
    String SERVER_ADDRESS = isDebugHost ? hostDebug : hostRelease;

    /**
     * GetListRsp
     */
    @GET("/cats/lv2/statistics/")
    Observable<GetListRsp> requestGetListRspList(@QueryMap Map<String, String> params);
}
