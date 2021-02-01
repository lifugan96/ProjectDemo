package com.glf.rxjavademo.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.glf.rxjavademo.R;
import com.glf.rxjavademo.utils.LogUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {

    private FrameLayout mBaseContent;

    private State currentState = State.NONE;
    private View mSuccessView;
    private View mLoadLoadingView;
    private View mLoadErrorView;
    private View mLoadEmptyView;

    public enum State {
        NONE, LOADING, SUCCESS, ERROR, EMPTY
    }

    private View rootView;
    private Unbinder mBind;

    @OnClick(R.id.tv_error)
    public void retry(View view) {
        LogUtils.d(this, "重试");
        onRetryNetWorkClick();
    }

    /**
     * 网络错误 点击了重试
     */
    protected void onRetryNetWorkClick() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = loadRootView(inflater, container);
        mBaseContent = rootView.findViewById(R.id.base_content);
        loadStatesView(inflater, container);
        mBind = ButterKnife.bind(this, rootView);
        initView(rootView);
        initPresenter();
        loadData();
        return rootView;
    }

    /**
     * 加载各种状态页面
     *
     * @param inflater
     * @param container
     */
    private void loadStatesView(LayoutInflater inflater, ViewGroup container) {
        mSuccessView = loadSuccessView(inflater, container);
        mBaseContent.addView(mSuccessView);
        mLoadLoadingView = loadLoadingView(inflater, container);
        mBaseContent.addView(mLoadLoadingView);
        mLoadErrorView = loadErrorView(inflater, container);
        mBaseContent.addView(mLoadErrorView);
        mLoadEmptyView = loadEmptyView(inflater, container);
        mBaseContent.addView(mLoadEmptyView);
        setUpState(State.NONE);
    }

    /**
     * 子类通过这个方法切换状态
     *
     * @param state
     */
    public void setUpState(State state) {
        this.currentState = state;
        mSuccessView.setVisibility(currentState == State.SUCCESS ? View.VISIBLE : View.GONE);
        mLoadLoadingView.setVisibility(currentState == State.LOADING ? View.VISIBLE : View.GONE);
        mLoadErrorView.setVisibility(currentState == State.ERROR ? View.VISIBLE : View.GONE);
        mLoadEmptyView.setVisibility(currentState == State.EMPTY ? View.VISIBLE : View.GONE);
    }

    /**
     * 用于复写首页默认布局
     * <p>
     * 例子：如果页面中有部分界面不需要等待网络优先加载，那么可以直接加载出来在装配对应的fragment页面
     * <p>
     * 优先加载：
     * <top><top/>
     * <p>
     * 后加载：
     * <FrameLayout id="与base FrameLayout id保持一致">
     *
     * </FrameLayout>
     *
     * @param inflater
     * @param container
     * @return
     */
    protected View loadRootView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.base_fragment_layout, container, false);
    }

    /**
     * 加载loding页面
     *
     * @param inflater
     * @param container
     * @return
     */
    protected View loadLoadingView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_loading, container, false);
    }

    /**
     * 成功页面 数据结果
     *
     * @param inflater
     * @param container
     * @return
     */
    protected View loadSuccessView(LayoutInflater inflater, ViewGroup container) {
        int resId = bindLayout();
        return inflater.inflate(resId, container, false);
    }

    /**
     * 错误页面
     *
     * @param inflater
     * @param container
     * @return
     */
    protected View loadErrorView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_error, container, false);
    }

    /**
     * 空页面
     *
     * @param inflater
     * @param container
     * @return
     */
    private View loadEmptyView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_empty, container, false);
    }

    protected  void initView(View rootView){

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (null != mBind) {
            mBind.unbind();
        }
        relese();
    }

    //释放资源
    protected void relese() {

    }

    //初始化
    protected void initPresenter() {

    }

    //加载
    protected void loadData() {

    }

    /**
     * 子类必须实现
     *
     * @return
     */
    protected abstract int bindLayout();
}
