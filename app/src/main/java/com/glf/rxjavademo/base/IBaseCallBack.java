package com.glf.rxjavademo.base;

public interface IBaseCallBack {

    /**
     * 加载中
     */
    void onLoading();

    /**
     * 加载错误
     */
    void onError();

    /**
     * 空数据
     */
    void onEmpty();
}
