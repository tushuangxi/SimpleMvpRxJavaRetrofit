package com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.interfaceUtils;

import com.lding.tshyserial.simplemvprxjavaretrofit.entity.GetListRsp;
import java.util.Map;
import rx.Subscription;

public class interfaceUtilsAll {

    public interface IBaseView {
        void showProgress();
        void hideProgress();
        void loadGetListRspInfo(GetListRsp getListRsp);
        void setLoadingIndicator(boolean active);
        void init();
    }
    public interface SubjectAllListModel {

        Subscription getGetListRspListData(Map<String, String> params);
    }
    public interface IBasePresenter {

        void getGetListRspListInfo(boolean isRefresh, Map<String, String> params);
    }
    public interface IPresenter {
        void onUnsubscribe();
        void addSubscription(Subscription subscriber);
    }

}
