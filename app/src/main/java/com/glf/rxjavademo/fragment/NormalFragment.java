package com.glf.rxjavademo.fragment;


import android.view.View;

import com.glf.rxjavademo.R;
import com.glf.rxjavademo.base.BaseFragment;
import com.glf.rxjavademo.model.domain.NormalCategory;
import com.glf.rxjavademo.model.domain.NormalContent;
import com.glf.rxjavademo.presenter.INormalPersenter;
import com.glf.rxjavademo.utils.LogUtils;
import com.glf.rxjavademo.utils.PresenterManager;
import com.glf.rxjavademo.view.INormalCallBack;

public class NormalFragment extends BaseFragment implements INormalCallBack {


    private INormalPersenter mINormalPersenter;

    @Override
    protected void initPresenter() {
        super.initPresenter();
        mINormalPersenter = PresenterManager.getInstance().getINormalPersenter();
        mINormalPersenter.registerCallback(this);
        mINormalPersenter.getCategories();
    }

    @Override
    protected int bindLayout() {
        return R.layout.fragment_normal;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
    }

    @Override
    public void onCategoriesLoaded(NormalCategory normalCategory) {
        LogUtils.d(this, "onCategoriesLoaded--->" + normalCategory);
        mINormalPersenter.getContentByCategoryId(normalCategory.getData().get(0));
    }

    @Override
    public void onContentLoaded(NormalContent content) {
        LogUtils.d(this, "onContentLoaded--->" + content);
    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void onEmpty() {

    }

    @Override
    protected void relese() {
        super.relese();
        mINormalPersenter.unregisterCallback(this);
    }
}
