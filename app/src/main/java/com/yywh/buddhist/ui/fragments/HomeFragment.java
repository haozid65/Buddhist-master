package com.yywh.buddhist.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;
import com.yywh.buddhist.R;
import com.yywh.buddhist.http.XApi;
import com.yywh.buddhist.http.XCallback;
import com.yywh.buddhist.http.pojo.HomeData;
import com.yywh.buddhist.ui.AboutMeActivity;
import com.yywh.buddhist.ui.H5Activity;
import com.yywh.buddhist.ui.SearchActivity;
import com.yywh.buddhist.ui.adapter.MeritListAdapter;

import org.xutils.x;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import cn.bingoogolapple.refreshlayout.BGANormalRefreshViewHolder;
import cn.bingoogolapple.refreshlayout.BGARefreshLayout;

/**
 * 首页
 */
public class HomeFragment extends BaseFragment implements BGARefreshLayout.BGARefreshLayoutDelegate, View.OnClickListener {

    @BindView(R.id.refresh_layout)
    BGARefreshLayout refreshLayout;
    @BindView(R.id.banner)
    ConvenientBanner banner;

    @BindView(R.id.iv_temple_1)
    ImageView ivTemple1;
    @BindView(R.id.tv_temple_name_1)
    TextView tvTempleName1;
    @BindView(R.id.tv_temple_addr_1)
    TextView tvTempleAddr1;

    @BindView(R.id.tv_rabbi_name_1)
    TextView tvRabbiName1;
    @BindView(R.id.tv_rabbi_name_2)
    TextView tvRabbiName2;
    @BindView(R.id.tv_rabbi_temple_1)
    TextView tvRabbiTemple1;
    @BindView(R.id.tv_rabbi_temple_2)
    TextView tvRabbiTemple2;
    @BindView(R.id.riv_rabbi1)
    RoundedImageView rivRabbi1;
    @BindView(R.id.riv_rabbi2)
    RoundedImageView rivRabbi2;
    @BindView(R.id.iv_temple_2)
    ImageView ivTemple2;
    @BindView(R.id.tv_temple_name_2)
    TextView tvTempleName2;
    @BindView(R.id.tv_temple_addr_2)
    TextView tvTempleAddr2;
    @BindView(R.id.ll_1)
    LinearLayout ll1;
    @BindView(R.id.ll_2)
    LinearLayout ll2;
    @BindView(R.id.list_view)
    ListView listView;


    @BindView(R.id.iv_head)
    ImageView ivHead;




    private MeritListAdapter meritAdapter;
    private Timer meritTimer;

    @BindView(R.id.rl_search)
    RelativeLayout rlSearch;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    protected void init() {
        refreshLayout.setRefreshViewHolder(new BGANormalRefreshViewHolder(getContext(), false));
        refreshLayout.setDelegate(this);
        refreshLayout.beginRefreshing();
        ll1.setOnClickListener(this);
        ll2.setOnClickListener(this);
        rivRabbi1.setOnClickListener(this);
        rivRabbi2.setOnClickListener(this);
        rlSearch.setOnClickListener(this);
        listView.setAdapter(meritAdapter = new MeritListAdapter(getContext()));
        ivHead.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
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
        XApi.get("http://wx.yywhsh.com/api/index/index?code=yywhsh_code", new XCallback<String, HomeData>(this) {
            @Override
            public HomeData prepare(String rawData) {
                return XApi.getRespResult(rawData, HomeData.class);
            }

            @Override
            public void onSuccess(HomeData result) {
                setBanner(result.getBanners());
                setMeritList(result.getMeritList());
                setTemple(result.getTemples());
                setRabbi(result.getMasters());
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
    private void setBanner(List<HomeData.BannersBean> list) {
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
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.ll_1:
                if (ll1.getTag() != null) {
                    intent = new Intent(getContext(), H5Activity.class);
                    intent.putExtra(H5Activity.KEY_ID, ll1.getTag().toString());
                    intent.putExtra(H5Activity.KEY_TYPE, H5Activity.TYPE_TEMPLE);
                }
                break;

            case R.id.ll_2:
                if (ll2.getTag() != null) {
                    intent = new Intent(getContext(), H5Activity.class);
                    intent.putExtra(H5Activity.KEY_ID, ll2.getTag().toString());
                    intent.putExtra(H5Activity.KEY_TYPE, H5Activity.TYPE_TEMPLE);
                }
                break;

            case R.id.riv_rabbi1:
                if (rivRabbi1.getTag() != null) {
                    intent = new Intent(getContext(), H5Activity.class);
                    intent.putExtra(H5Activity.KEY_ID, rivRabbi1.getTag().toString());
                    intent.putExtra(H5Activity.KEY_TYPE, H5Activity.TYPE_RABBI);
                }
                break;

            case R.id.riv_rabbi2:
                if (rivRabbi2.getTag() != null) {
                    intent = new Intent(getContext(), H5Activity.class);
                    intent.putExtra(H5Activity.KEY_ID, rivRabbi2.getTag().toString());
                    intent.putExtra(H5Activity.KEY_TYPE, H5Activity.TYPE_RABBI);
                }
                break;

            case R.id.rl_search:
                intent = new Intent(getContext(), SearchActivity.class);
                break;

            case R.id.iv_head:
                intent = new Intent(getContext(), AboutMeActivity.class);
                break;
        }
        if (intent != null) startActivity(intent);
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
                listView.smoothScrollBy(15, 2);
            }
        }, 1000, 1000);
    }

    /**
     * 設置推荐寺庙
     */
    private void setTemple(List<HomeData.TemplesBean> list) {
        if (list == null || list.isEmpty()) return;

        if (list.get(0) != null) {
            Glide.with(this).load(list.get(0).getTp_logo()).into(ivTemple1);
            tvTempleName1.setText(list.get(0).getTp_name());
            tvTempleAddr1.setText(list.get(0).getTp_profile());
            ll1.setTag(list.get(0).getTp_id());
        }

        if (list.size() > 1 && list.get(1) != null) {
            Glide.with(this).load(list.get(1).getTp_logo()).into(ivTemple2);
            tvTempleName2.setText(list.get(1).getTp_name());
            tvTempleAddr2.setText(list.get(1).getTp_profile());
            ll2.setTag(list.get(1).getTp_id());
        }
    }

    /**
     * 设置推荐法师
     */
    private void setRabbi(List<HomeData.MastersBean> list) {
        if (list == null || list.isEmpty()) return;

        if (list.get(0) != null) {
            Glide.with(this).load(list.get(0).getMa_logo()).into(rivRabbi1);
            tvRabbiName1.setText(list.get(0).getMa_name());
            rivRabbi1.setTag(list.get(0).getMa_id());
            if (list.get(0).getRaiseList() != null)
                tvRabbiTemple1.setText(list.get(0).getRaiseList().getTp_name());
        }

        if (list.size() > 1 && list.get(1) != null) {
            Glide.with(this).load(list.get(1).getMa_logo()).into(rivRabbi2);
            tvRabbiName2.setText(list.get(1).getMa_name());
            rivRabbi2.setTag(list.get(1).getMa_id());
            if (list.get(1).getRaiseList() != null)
                tvRabbiTemple2.setText(list.get(1).getRaiseList().getTp_name());
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (meritTimer != null) {
            meritTimer.cancel();
            meritTimer = null;
        }
    }
}
