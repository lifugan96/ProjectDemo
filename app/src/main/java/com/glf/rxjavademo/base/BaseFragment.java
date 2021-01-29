package com.glf.rxjavademo.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {
    private View rootView;
    private Unbinder mBind;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(bindLayout(), container, false);
        mBind = ButterKnife.bind(this,rootView);
        initPresenter();
        loadData();
        initView(rootView);
        return rootView;
    }

    protected abstract void initView(View rootView);

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (null != mBind) {
            mBind.unbind();
        }
        relese();
    }

    //释放资源
    protected abstract void relese();

    //初始化
    protected abstract void initPresenter();

    //加载
    protected abstract void loadData();

    /**
     * 子类必须实现
     *
     * @return
     */
    protected abstract int bindLayout();
}
