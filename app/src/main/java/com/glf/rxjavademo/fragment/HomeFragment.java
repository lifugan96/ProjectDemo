package com.glf.rxjavademo.fragment;

import android.view.View;

import androidx.viewpager.widget.ViewPager;

import com.glf.rxjavademo.R;
import com.glf.rxjavademo.adapter.HomePagerAdapter;
import com.glf.rxjavademo.base.BaseFragment;
import com.glf.rxjavademo.model.domain.Categories;
import com.glf.rxjavademo.presenter.IHomePresenter;
import com.glf.rxjavademo.presenter.impl.HomePresenterImpl;
import com.glf.rxjavademo.view.IHomeCallBack;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends BaseFragment implements IHomeCallBack {


    @BindView(R.id.home_indicator)
    public TabLayout mTableLayout;

    @BindView(R.id.home_viewpager)
    public ViewPager mViewPager;

    private IHomePresenter mHomePresenter;
    private HomePagerAdapter mHomePagerAdapter;

    @Override
    protected int bindLayout() {
        return R.layout.fragment_home;
    }


    @Override
    protected void initPresenter() {
        mHomePresenter = new HomePresenterImpl();
        mHomePresenter.registerCallback(this);
    }

    @Override
    protected void loadData() {
        mHomePresenter.getCategories();

    }

    @Override
    protected void initView(View rootView) {

        mTableLayout.setupWithViewPager(mViewPager);
        mHomePagerAdapter = new HomePagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mHomePagerAdapter);
    }

    @Override
    protected void relese() {
        if (null != mHomePresenter) {
            mHomePresenter.unregisterCallback(this);

        }
    }

    @Override
    public void onCategoriesLoaded(Categories categories) {
        if (null != mHomePagerAdapter) {
            mHomePagerAdapter.setCategories(categories);
        }
    }
}
