package com.yywh.buddhist.ui;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.yywh.buddhist.R;

import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 登录界面
 */
public class LoginActivity extends BaseActivity{

    @BindView(R.id.weixin_login)    // 微信登录
    LinearLayout weixinLogin;
    @BindView(R.id.weibo_login)     // 微博登录
    LinearLayout weiboLogin;
    @BindView(R.id.qq_login)        // QQ登录
    LinearLayout qqLogin;

    UMShareAPI umShareAPI;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        umShareAPI = UMShareAPI.get(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        umShareAPI.onActivityResult(requestCode, resultCode, data);
    }

    @OnClick({R.id.weixin_login, R.id.qq_login, R.id.tv_justLook, R.id.tv_register, R.id.tv_emailLogin})
    public void doClick(View view) {
        switch (view.getId()) {
            case R.id.tv_justLook:  // 随便看看
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                return;

            case R.id.tv_register:  // 邮箱注册
                startActivity(new Intent(LoginActivity.this,RegisterEmailActivity.class));
                return;

            case R.id.tv_emailLogin:  // 邮箱登录
                startActivity(new Intent(LoginActivity.this,LoginEmailActivity.class));
                return;

            case R.id.weixin_login:
                toAuthLogin(SHARE_MEDIA.WEIXIN);

                return;

            case R.id.qq_login:
                toAuthLogin(SHARE_MEDIA.QQ);
                return;
            case R.id.weibo_login:
                toAuthLogin(SHARE_MEDIA.SINA);

        }
    }


    /**
     * 授权登录
     */
    private void toAuthLogin(SHARE_MEDIA platform) {
        umShareAPI.doOauthVerify(this, platform, umAuthListener);
    }

    /**
     * 友盟授权登录的回调
     */
    private UMAuthListener umAuthListener = new UMAuthListener() {
        @Override
        public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
            Toast.makeText(LoginActivity.this, "授权登录成功！", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
            Toast.makeText(LoginActivity.this, "授权失败...", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onCancel(SHARE_MEDIA share_media, int i) {
            Toast.makeText(LoginActivity.this, "取消授权...", Toast.LENGTH_SHORT).show();
        }
    };

}
