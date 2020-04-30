package com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.appcompat.app.AppCompatActivity;

import com.lding.tshyserial.simplemvprxjavaretrofit.entity.GetListRsp;
import com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.interfaceUtils.interfaceUtilsAll;
import butterknife.ButterKnife;

/**
 * Created by jiangzn on 16/9/21.
 */
public class BaseActivity extends AppCompatActivity implements interfaceUtilsAll.IBaseView {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        ButterKnife.bind(this);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void loadGetListRspInfo(GetListRsp getListRsp) {

    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void init() {

    }

}
