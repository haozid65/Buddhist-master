package com.yywh.buddhist.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.yywh.buddhist.R;
import com.yywh.buddhist.http.XApi;
import com.yywh.buddhist.http.XCallback;
import com.yywh.buddhist.http.pojo.ActivityData;
import com.yywh.buddhist.ui.H5Activity;
import com.yywh.buddhist.ui.adapter.ActivityAdapter;

import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bingoogolapple.refreshlayout.BGANormalRefreshViewHolder;
import cn.bingoogolapple.refreshlayout.BGARefreshLayout;

/**
 * 活动
 */
public class ActivityFragment extends BaseFragment implements BGARefreshLayout.BGARefreshLayoutDelegate, AdapterView.OnItemClickListener {

    public static Fragment newInstance() {
        return new ActivityFragment();
    }

    @BindView(R.id.refresh_layout)
    BGARefreshLayout refreshLayout;
    ConvenientBanner banner;

    @BindView(R.id.list_view)
    ListView listView;
    ActivityAdapter adapter;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_activity;
    }

    @Override
    protected void init() {
        listView.setAdapter(adapter = new ActivityAdapter(getContext()));
        View headerView = LayoutInflater.from(getContext()).inflate(R.layout.layout_activity_head, null);
        banner = ButterKnife.findById(headerView, R.id.banner);
        listView.addHeaderView(headerView);
        listView.setOnItemClickListener(this);


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
        XApi.get("http://wx.yywhsh.com/api/activity", new XCallback<String, ActivityData>(this) {
            @Override
            public ActivityData prepare(String rawData) {
                return XApi.getRespResult(rawData, ActivityData.class);
            }

            @Override
            public void onSuccess(ActivityData result) {
                setBanner(result.getBanners());
                setListViewData(result.getActivity(), result.getNews());
            }

            @Override
            public void onFinished() {
                refreshLayout.endRefreshing();
            }
        });
    }

    /**
     * 设置幻灯片
     */
    private void setBanner(List<ActivityData.BannersBean> list) {
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
        if (adapter.getItem(position) instanceof ActivityData.ActivityBean) {
            intent.putExtra(H5Activity.KEY_ID, ((ActivityData.ActivityBean) adapter.getItem(position)).getAt_id());
            intent.putExtra(H5Activity.KEY_TYPE, H5Activity.TYPE_ACTIVITY);
        } else {
            intent.putExtra(H5Activity.KEY_ID, ((ActivityData.NewsBean) adapter.getItem(position)).getNew_id());
            intent.putExtra(H5Activity.KEY_TYPE, H5Activity.TYPE_NEWS);
        }
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
    private void setListViewData(List<ActivityData.ActivityBean> activities, List<ActivityData.NewsBean> news) {
        adapter.setAdapterData(activities, news);
    }

}
