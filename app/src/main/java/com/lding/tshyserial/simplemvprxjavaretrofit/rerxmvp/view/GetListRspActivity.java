package com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.lding.tshyserial.simplemvprxjavaretrofit.R;
import com.lding.tshyserial.simplemvprxjavaretrofit.entity.GetListRsp;
import com.lding.tshyserial.simplemvprxjavaretrofit.http.ServiceMapParams;
import com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.base.BaseActivity;
import com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.interfaceUtils.interfaceUtilsAll;
import com.lding.tshyserial.simplemvprxjavaretrofit.rerxmvp.presenter.GetListRspPresenter;
import com.lding.tshyserial.simplemvprxjavaretrofit.utils.LogUtils;
import butterknife.BindView;
import butterknife.ButterKnife;

public class GetListRspActivity extends BaseActivity implements interfaceUtilsAll.IBaseView {
    @BindView(R.id.btn_commit)
    Button btn_commit;

    private GetListRspPresenter mBookPresenter;
    @BindView(R.id.refresh_layout_main)
    SwipeRefreshLayout srl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();
    }

    @Override
    public void init() {
        btn_commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBookPresenter = new GetListRspPresenter(GetListRspActivity.this);
                mBookPresenter.getGetListRspListInfo(true,ServiceMapParams.getPostListRspMapParams());
            }
        });



        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mBookPresenter = new GetListRspPresenter(GetListRspActivity.this);
                mBookPresenter.getGetListRspListInfo(true,ServiceMapParams.getPostListRspMapParams());
            }
        });
    }

    @Override
    public void showProgress() {
        setLoadingIndicator(true);
    }

    @Override
    public void hideProgress() {
        mBookPresenter.onUnsubscribe();
        setLoadingIndicator(false);

    }

    @Override
    public void loadGetListRspInfo(GetListRsp getListRsp) {

        LogUtils.d("getListRsp==" + getListRsp.toString());
        Toast.makeText(GetListRspActivity.this,"请求成功 "+getListRsp.getFemale().get(0).getName(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setLoadingIndicator(final boolean active) {
        srl.post(new Runnable() {
            @Override
            public void run() {
                //显示刷新框
                srl.setRefreshing(active);
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //取消注册
        mBookPresenter.onUnsubscribe();
    }
}
