package com.yywh.buddhist.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.yywh.buddhist.R;
import com.yywh.buddhist.http.XApi;
import com.yywh.buddhist.http.XCallback;
import com.yywh.buddhist.http.pojo.SearchData;
import com.yywh.buddhist.ui.adapter.SearchAdapter;
import com.yywh.buddhist.utils.AppUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import cn.bingoogolapple.refreshlayout.BGANormalRefreshViewHolder;
import cn.bingoogolapple.refreshlayout.BGARefreshLayout;

public class SearchActivity extends BaseActivity implements BGARefreshLayout.BGARefreshLayoutDelegate, TextView.OnEditorActionListener, AdapterView.OnItemClickListener {

    @BindView(R.id.et_key)
    EditText etKey;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.grid_view)
    GridView gridView;
    @BindView(R.id.tv_temple_icon)
    TextView tvTempleIcon;
    @BindView(R.id.refresh_layout)
    BGARefreshLayout refreshLayout;

    private SearchAdapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    protected void init() {
        refreshLayout.setRefreshViewHolder(new BGANormalRefreshViewHolder(this, false));
        refreshLayout.setDelegate(this);
        etKey.setOnEditorActionListener(this);

        gridView.setAdapter(adapter = new SearchAdapter(this));
        gridView.setOnItemClickListener(this);
    }

    @OnClick(R.id.tv_cancel)
    public void doClick(View view) {
        finish();
    }

    @Override
    public void onBGARefreshLayoutBeginRefreshing(BGARefreshLayout refreshLayout) {
        reqData();
    }

    @Override
    public boolean onBGARefreshLayoutBeginLoadingMore(BGARefreshLayout refreshLayout) {
        return false;
    }

    private void reqData() {
        XApi.get("http://wx.yywhsh.com/api/temple/index?code=yywhsh_code", new XCallback<String, List<SearchData.TemplesAllBean>>(this) {
            @Override
            public List<SearchData.TemplesAllBean> prepare(String rawData) {
                SearchData result = XApi.getRespResult(rawData, SearchData.class);

                if (!TextUtils.isEmpty(etKey.getText().toString()) && result != null && result.getTemplesAll() != null && result.getTemplesAll().size() > 0) {
                    for (int i = 0; i <  result.getTemplesAll().size(); i++) {
                        if (!result.getTemplesAll().get(i).getTp_name().contains(etKey.getText().toString()))
                            result.getTemplesAll().remove(i);
                    }
                }

                return result.getTemplesAll();
            }

            @Override
            public void onSuccess(List<SearchData.TemplesAllBean> result) {
                if (result == null || result.size() == 0) {
                    tvTempleIcon.setVisibility(View.GONE);
                    Toast.makeText(SearchActivity.this, "搜索无结果", Toast.LENGTH_SHORT).show();
                } else {
                    tvTempleIcon.setVisibility(View.VISIBLE);
                }
                adapter.setData(result);
            }

            @Override
            public void onFinished() {
                refreshLayout.endRefreshing();
            }
        });
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        AppUtils.hideSoftInput(this, v);
        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            refreshLayout.beginRefreshing();
        }
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, H5Activity.class);
        intent.putExtra(H5Activity.KEY_ID, adapter.getItem(position).getTp_id());
        intent.putExtra(H5Activity.KEY_TYPE, H5Activity.TYPE_TEMPLE);
    }
}
