package com.glf.rxjavademo.presenter;

import com.glf.rxjavademo.base.IBasePresenter;
import com.glf.rxjavademo.view.IHomeCallBack;

public interface IHomePresenter extends IBasePresenter<IHomeCallBack> {


    /**
     * 加载数据接口
     */
    void getCategories();

}
