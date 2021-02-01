package com.glf.rxjavademo.base;

public interface IBasePresenter<T> {

    /**
     * 注册ui通知接口
     *
     * @param callBack
     */
    void registerCallback(T callBack);

    /**
     * 取消ui通知接口
     *O
     * @param callBack
     */
    void unregisterCallback(T callBack);
}
