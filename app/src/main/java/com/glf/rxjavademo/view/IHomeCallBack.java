package com.glf.rxjavademo.view;

import com.glf.rxjavademo.base.IBaseCallBack;
import com.glf.rxjavademo.model.domain.Categories;

public interface IHomeCallBack extends IBaseCallBack {


    void onCategoriesLoaded(Categories categories);


}
