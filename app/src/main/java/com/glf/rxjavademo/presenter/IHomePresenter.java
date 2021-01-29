package com.glf.rxjavademo.presenter;

import com.glf.rxjavademo.view.IHomeCallBack;

public interface IHomePresenter {


    void getCategories();

    void registerCallback(IHomeCallBack callBack);

    void unregisterCallback(IHomeCallBack callBack);

}
