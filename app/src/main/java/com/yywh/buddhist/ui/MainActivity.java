package com.yywh.buddhist.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.yywh.buddhist.R;
import com.yywh.buddhist.http.XApi;
import com.yywh.buddhist.http.XCallback;
import com.yywh.buddhist.ui.fragments.ActivityFragment;
import com.yywh.buddhist.ui.fragments.HomeFragment;
import com.yywh.buddhist.ui.fragments.RabbiFragment;
import com.yywh.buddhist.ui.fragments.RaiseFragment;
import com.yywh.buddhist.ui.fragments.TempleFragment;

import butterknife.BindView;
import butterknife.OnCheckedChanged;

/**
 * 主页
 */
public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.fl_container)
    FrameLayout flContainer;
    @BindView(R.id.rb_home)
    RadioButton rbHome;
    @BindView(R.id.rb_temple)
    RadioButton rbTemple;
    @BindView(R.id.rb_rabbi)
    RadioButton rbRabbi;
    @BindView(R.id.rb_raise)
    RadioButton rbRaise;
    @BindView(R.id.rb_activity)
    RadioButton rbActivity;
    @BindView(R.id.rg_bottom)
    RadioGroup rgBottom;


    private Fragment[] fragments = new Fragment[] {
            HomeFragment.newInstance(),
            TempleFragment.newInstance(),
            RabbiFragment.newInstance(),
            RaiseFragment.newInstance(),
            ActivityFragment.newInstance(),
    };

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void init() {
        rgBottom.setOnCheckedChangeListener(this);
        showFragment(0);

    }

    /**
     * 改变Fragment
     *
     * @param page
     */
    private void showFragment(int page) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        if (!fragments[page].isAdded()) ft.add(R.id.fl_container, fragments[page]);
        ft.show(fragments[page]);
        for (int i = 0; i < fragments.length; i++) {
            if (i != page && fragments[i].isAdded()) ft.hide(fragments[i]);
        }

        ft.commit();
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int page = 0;
        switch (checkedId) {
            case R.id.rb_home:
                page = 0;
                break;
            case R.id.rb_temple:
                page = 1;
                break;
            case R.id.rb_rabbi:
                page = 2;
                break;
            case R.id.rb_raise:
                page = 3;
                break;
            case R.id.rb_activity:
                page = 4;
                break;
        }
        showFragment(page);
    }
}
