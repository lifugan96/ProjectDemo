package com.glf.rxjavademo.view;

import com.glf.rxjavademo.base.IBaseCallBack;
import com.glf.rxjavademo.model.domain.NormalCategory;
import com.glf.rxjavademo.model.domain.NormalContent;

public interface INormalCallBack extends IBaseCallBack {

    /**
     * 获取分类类容
     *
     * @param normalCategory
     */
    void onCategoriesLoaded(NormalCategory normalCategory);


    /**
     * 获取详细内容
     *
     * @param content
     */
    void onContentLoaded(NormalContent content);

}
