package com.glf.rxjavademo.presenter;

import com.glf.rxjavademo.base.IBasePresenter;
import com.glf.rxjavademo.model.domain.NormalCategory;
import com.glf.rxjavademo.view.INormalCallBack;

public interface INormalPersenter extends IBasePresenter<INormalCallBack> {

    /**
     * 获取首页分类
     */
    void getCategories();


    /**
     * 根据分类获取类容
     *
     * @param dataBean
     */
    void getContentByCategoryId(NormalCategory.DataBean dataBean);


    /**
     * 重新加载内容
     */
    void reloadContent();
}
