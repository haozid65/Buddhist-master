package com.yywh.buddhist.ui;


import android.content.Intent;
import android.os.Handler;
import android.widget.TextView;

import com.yywh.buddhist.R;
import com.yywh.buddhist.utils.AppUtils;

import butterknife.BindView;

/**
 * 欢迎界面
 */
public class SplashActivity extends BaseActivity {


    @BindView(R.id.tv_version)
    TextView tvVersion;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init() {
        tvVersion.setText("版本: " + AppUtils.getVersionName(this));
        go2Next();
    }

    /**
     * 进入下一步
     */
    public void go2Next() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }, 500);
    }


}
