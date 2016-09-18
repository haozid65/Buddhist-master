package com.yywh.buddhist.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.yywh.buddhist.R;
import com.yywh.buddhist.http.XApi;
import com.yywh.buddhist.http.XCallback;
import com.yywh.buddhist.http.pojo.HomeData;
import com.yywh.buddhist.http.pojo.RaiseData;
import com.yywh.buddhist.ui.H5Activity;
import com.yywh.buddhist.ui.adapter.MeritListAdapter;
import com.yywh.buddhist.ui.adapter.RaiseAdapter;

import org.xutils.x;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bingoogolapple.refreshlayout.BGANormalRefreshViewHolder;
import cn.bingoogolapple.refreshlayout.BGARefreshLayout;

/**
 * 善筹
 */
public class RaiseFragment extends BaseFragment implements BGARefreshLayout.BGARefreshLayoutDelegate, AdapterView.OnItemClickListener {

    public static Fragment newInstance() {
        return new RaiseFragment();
    }

    @BindView(R.id.refresh_layout)
    BGARefreshLayout refreshLayout;
    ConvenientBanner banner;

    @BindView(R.id.list_view)
    ListView listView;
    private RaiseAdapter adapter;


    ListView listView2;
    private MeritListAdapter meritAdapter;
    private Timer meritTimer;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_raise;
    }

    @Override
    protected void init() {
        listView.setAdapter(adapter = new RaiseAdapter(getContext()));
        View headerView = LayoutInflater.from(getContext()).inflate(R.layout.layout_raise_head, null);
        banner = ButterKnife.findById(headerView, R.id.banner);
        listView2 = ButterKnife.findById(headerView, R.id.list_view);
        listView.addHeaderView(headerView);
        listView.setOnItemClickListener(this);

        listView2.setAdapter(meritAdapter = new MeritListAdapter(getContext()));

        refreshLayout.setRefreshViewHolder(new BGANormalRefreshViewHolder(getContext(), false));
        refreshLayout.setDelegate(this);
        refreshLayout.beginRefreshing();
    }

    @Override
    public void onBGARefreshLayoutBeginRefreshing(BGARefreshLayout refreshLayout) {
        reqData();

    }

    @Override
    public boolean onBGARefreshLayoutBeginLoadingMore(BGARefreshLayout refreshLayout) {
        return false;
    }

    /**
     * 加载数据
     */
    private void reqData() {
        XApi.get("http://wx.yywhsh.com/api/raise/index?code=yywhsh_code", new XCallback<String, RaiseData>(this) {
            @Override
            public RaiseData prepare(String rawData) {
                return XApi.getRespResult(rawData, RaiseData.class);
            }

            @Override
            public void onSuccess(RaiseData result) {
                setBanner(result.getBanners());
                setMeritList(result.getMeritList());
                setListViewData(result.getRaises());
            }

            @Override
            public void onFinished() {
                refreshLayout.endRefreshing();
            }
        });
    }

    private void setMeritList(final List<HomeData.MeritListBean> list) {
        if (list == null || list.isEmpty()) return;

        if (meritTimer != null) {
            meritTimer.cancel();
            meritTimer = null;
        }

        meritTimer = new Timer();

        meritAdapter.setData(list);


        meritTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                listView2.smoothScrollBy(15, 2);
            }
        }, 1000, 1000);
    }

    /**
     * 设置幻灯片
     */
    private void setBanner(List<RaiseData.BannersBean> list) {
        if (list == null || list.size() == 0) return;

        List<String> urls = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            urls.add(list.get(i).getBa_logo());
        }

        banner.setPages(new CBViewHolderCreator<NetworkImageHolderView>() {
            @Override
            public NetworkImageHolderView createHolder() {
                return new NetworkImageHolderView();
            }
        }, urls)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {
                    }
                });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        position -= 1;
        Intent intent = new Intent(getContext(), H5Activity.class);
        intent.putExtra(H5Activity.KEY_ID, adapter.getItem(position).getRa_id());
        intent.putExtra(H5Activity.KEY_TYPE, H5Activity.TYPE_RAISE);
        startActivity(intent);
    }

    private static class NetworkImageHolderView implements Holder<String> {

        private ImageView imageView;

        @Override
        public View createView(Context context) {
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            return imageView;
        }

        @Override
        public void UpdateUI(Context context, int position, String data) {
            x.image().bind(imageView, data);
        }
    }

    /**
     * 设置listview数据
     */
    private void setListViewData(List<RaiseData.RaisesBean> list) {
        adapter.setAdapterData(list);
    }

}
