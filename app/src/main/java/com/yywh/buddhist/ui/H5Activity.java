package com.yywh.buddhist.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.yywh.buddhist.MyApp;
import com.yywh.buddhist.R;
import com.yywh.buddhist.ui.view.ProgressWebView;
import com.yywh.buddhist.utils.AppUtils;

import butterknife.BindView;

/**
 * 活动详情
 */
public class H5Activity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.web_view)
    ProgressWebView webView;

    public static final String KEY_ID = "_id";
    public static final String KEY_TYPE = "_type";

    public static final int TYPE_ACTIVITY = 0;
    public static final int TYPE_NEWS = 1;
    public static final int TYPE_TEMPLE = 2;
    public static final int TYPE_RABBI = 3;

    /** 活动的url地址 */
    private static final String URL_ACTIVITY = "http://wx.yywhsh.com/activity/details?atid=%s&vo_id=0";
    /** 新闻的url地址 */
    private static final String URL_NEWS = "http://wx.yywhsh.com/master/news?nid=%s";
    /** 寺庙的url地址 */
    private static final String URL_TEMPLE = "http://wx.yywhsh.com/temple/details?tid=%s";
    /** 法师的url地址 */
    private static final String URL_RABBI = "http://wx.yywhsh.com/master/details?mid=%s";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_activity_info;
    }

    @Override
    protected void init() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return onOptionsItemSelected(item);
            }
        });

        String url=getUrl();

        AppUtils.synCookies(this,url, MyApp.getCookieValue());

        webView.loadUrl(url);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });
        webView.getSettings().setJavaScriptEnabled(true);
    }

    private String getUrl() {
        String id = getIntent().getStringExtra(KEY_ID);
        String url;
        switch (getIntent().getIntExtra(KEY_TYPE, TYPE_ACTIVITY)) {
            case TYPE_ACTIVITY:
                url = String.format(URL_ACTIVITY, id);
                toolbarTitle.setText("活动详情");
                break;

            case TYPE_NEWS:
                url = String.format(URL_NEWS, id);
                toolbarTitle.setText("新闻详情");
                break;

            case TYPE_TEMPLE:
                url = String.format(URL_TEMPLE, id);
                toolbarTitle.setText("寺院详情");
                break;

            case TYPE_RABBI:
                url = String.format(URL_RABBI, id);
                toolbarTitle.setText("法师详情");
                break;

            default:
                url = "";
                break;
        }
        return url;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_text, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    finish();
                }

                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //可以在销毁的时候调用一下清除 cookie就没问题了。要把工具类的方法改成静态的
//        AppUtils.removeCookie(H5Activity.this);
    }
}
