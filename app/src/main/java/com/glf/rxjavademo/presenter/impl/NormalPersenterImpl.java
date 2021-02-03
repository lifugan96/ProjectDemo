package com.glf.rxjavademo.presenter.impl;

import com.glf.rxjavademo.model.Api;
import com.glf.rxjavademo.model.domain.NormalCategory;
import com.glf.rxjavademo.model.domain.NormalContent;
import com.glf.rxjavademo.presenter.INormalPersenter;
import com.glf.rxjavademo.utils.LogUtils;
import com.glf.rxjavademo.utils.RetrofitManager;
import com.glf.rxjavademo.view.INormalCallBack;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class NormalPersenterImpl implements INormalPersenter {

    private final Api mApi;
    private NormalCategory.DataBean mCurrentCategoryItem;

    public NormalPersenterImpl() {
        Retrofit retrofit = RetrofitManager.getInstance().getRetrofit();
        mApi = retrofit.create(Api.class);
    }

    private INormalCallBack mViewCallBack;

    @Override
    public void getCategories() {
        if (mViewCallBack != null) {
            mViewCallBack.onLoading();
        }
        Call<NormalCategory> normalCategory = mApi.getNormalCategory();
        normalCategory.enqueue(new Callback<NormalCategory>() {
            @Override
            public void onResponse(Call<NormalCategory> call, Response<NormalCategory> response) {
                int code = response.code();
                LogUtils.d(NormalPersenterImpl.this, "resutl code" + code);
                if (code == HttpURLConnection.HTTP_OK) {
                    NormalCategory mNormalCategory = response.body();
                    if (mViewCallBack != null) {
                        mViewCallBack.onCategoriesLoaded(mNormalCategory);
                    }
                } else {
                    errorCallBack();
                }
            }

            @Override
            public void onFailure(Call<NormalCategory> call, Throwable t) {
                errorCallBack();
            }
        });
    }

    private void errorCallBack() {
        if (mViewCallBack != null) {
            mViewCallBack.onError();
        }
    }

    @Override
    public void getContentByCategoryId(NormalCategory.DataBean dataBean) {
        this.mCurrentCategoryItem = dataBean;
        if (mCurrentCategoryItem == null) {
            return;
        }
        Call<NormalContent> normalContentCall = mApi.getNormalContent(mCurrentCategoryItem.getFavorites_id());
        normalContentCall.enqueue(new Callback<NormalContent>() {
            @Override
            public void onResponse(Call<NormalContent> call, Response<NormalContent> response) {
                int code = response.code();
                LogUtils.d(NormalPersenterImpl.this, "resutl code" + code);
                if (code == HttpURLConnection.HTTP_OK) {
                    NormalContent normalContent = response.body();
                    if (mViewCallBack != null) {
                        mViewCallBack.onContentLoaded(normalContent);
                    }
                } else {
                    errorCallBack();
                }
            }

            @Override
            public void onFailure(Call<NormalContent> call, Throwable t) {
                errorCallBack();
            }
        });

    }

    @Override
    public void reloadContent() {
        if (mCurrentCategoryItem != null) {
            this.getContentByCategoryId(mCurrentCategoryItem);
        }
    }

    @Override
    public void registerCallback(INormalCallBack callBack) {
        this.mViewCallBack = callBack;
    }

    @Override
    public void unregisterCallback(INormalCallBack callBack) {
        this.mViewCallBack = null;
    }
}
