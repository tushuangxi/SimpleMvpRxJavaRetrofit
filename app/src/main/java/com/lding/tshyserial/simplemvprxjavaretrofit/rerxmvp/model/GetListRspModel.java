package com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.model;

import com.lding.tshyserial.simplemvprxjavaretrofit.entity.GetListRsp;
import com.lding.tshyserial.simplemvprxjavaretrofit.http.manager.RetrofitManager;
import com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.interfaceUtils.interfaceUtilsAll;
import java.util.Map;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by jiangzn on 16/9/27.
 */
public class GetListRspModel implements interfaceUtilsAll.SubjectAllListModel {
    private BookOnListener mBookOnListener;

    public GetListRspModel(BookOnListener mBookOnListener) {
        this.mBookOnListener = mBookOnListener;
    }

    @Override
    public Subscription getGetListRspListData( Map<String, String> params) {
        Observable<GetListRsp> request = RetrofitManager.getInstance().requestGetListRspList(params);
        Subscription subscription = request.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<GetListRsp>() {
                               @Override
                               public void call(GetListRsp getListRsp) {
                                mBookOnListener.onSuccess(getListRsp);
                               }
                           },
                        new Action1<Throwable>() {
                            @Override
                            public void call(Throwable throwable) {
                                mBookOnListener.onFailure(throwable);
                            }
                        });
        return subscription;
    }


    /**
     * 请求结果回调接口
     */
    public interface BookOnListener {
        void onSuccess(GetListRsp getListRsp);

        void onFailure(Throwable e);
    }
}
