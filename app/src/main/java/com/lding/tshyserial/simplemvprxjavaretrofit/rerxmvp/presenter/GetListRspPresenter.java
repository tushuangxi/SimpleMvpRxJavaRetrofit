package com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.presenter;

import com.lding.tshyserial.simplemvprxjavaretrofit.entity.GetListRsp;
import com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.base.BasePresenter;
import com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.interfaceUtils.interfaceUtilsAll;
import com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.model.GetListRspModel;
import com.lding.tshyserial.simplemvprxjavaretrofit.utils.LogUtils;

import java.util.Map;

/**
 * Created by jiangzn on 16/9/27.
 */
public class GetListRspPresenter extends BasePresenter implements interfaceUtilsAll.IBasePresenter, GetListRspModel.BookOnListener {
    private interfaceUtilsAll.SubjectAllListModel mBookModel;
    private interfaceUtilsAll.IBaseView mBookView;

    public GetListRspPresenter(interfaceUtilsAll.IBaseView mBookView) {
        this.mBookView = mBookView;
        this.mBookModel = new GetListRspModel(this);
    }

    @Override
    public void getGetListRspListInfo(boolean isRefresh, Map<String, String> params) {
        mBookView.showProgress();
        addSubscription(mBookModel.getGetListRspListData(params));
    }
    @Override
    public void onSuccess(GetListRsp getListRsp) {
        mBookView.loadGetListRspInfo(getListRsp);
        mBookView.hideProgress();
        LogUtils.d("onSuccess() :" + getListRsp.toString());
    }

    @Override
    public void onFailure(Throwable e) {
        mBookView.hideProgress();
        LogUtils.d("onFailure() :" + e.getMessage());
    }


}
