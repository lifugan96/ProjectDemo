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

public class HomePagerFragment extends BaseFragment implements IHomeCallBack {


    @Override
    protected int bindLayout() {
        return R.layout.fragment_home_pager;
    }


    @Override
    protected void initPresenter() {

    }

    @Override
    protected void loadData() {


    }

    @Override
    protected void initView(View rootView) {

    }

    @Override
    protected void relese() {

    }

    @Override
    public void onCategoriesLoaded(Categories categories) {

    }
}
