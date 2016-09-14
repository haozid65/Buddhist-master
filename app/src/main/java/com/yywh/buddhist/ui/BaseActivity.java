package com.yywh.buddhist.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * activity的父类
 */
public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        init();
    }

    /**
     * setter layout contentView
     * */
    protected abstract int getLayoutId();

    /**
     * initialize data
     */
    protected void init() {}

}
