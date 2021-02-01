package com.glf.rxjavademo.presenter.impl;

import com.glf.rxjavademo.model.Api;
import com.glf.rxjavademo.model.domain.Categories;
import com.glf.rxjavademo.presenter.IHomePresenter;
import com.glf.rxjavademo.utils.LogUtils;
import com.glf.rxjavademo.utils.RetrofitManager;
import com.glf.rxjavademo.view.IHomeCallBack;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HomePresenterImpl implements IHomePresenter {

    private IHomeCallBack mCallback;

    @Override
    public void getCategories() {
        if (mCallback != null) {
            mCallback.onLoading();
        }
        Retrofit retrofit = RetrofitManager.getInstance().getRetrofit();
        Api api = retrofit.create(Api.class);
        Call<Categories> categories = api.getCategories();
        categories.enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(Call<Categories> call, Response<Categories> response) {
                Categories categories = response.body();
                LogUtils.d(HomePresenterImpl.this, "response--->" + categories.toString());
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    if (mCallback != null) {
                        if (categories == null || categories.getData().size() == 0) {
                            mCallback.onEmpty();
                        } else {
                            mCallback.onCategoriesLoaded(categories);
                        }
                    }
                } else {
                    if (mCallback != null) {
                        mCallback.onError();
                    }
                }
            }

            @Override
            public void onFailure(Call<Categories> call, Throwable t) {
                if (mCallback != null) {
                    mCallback.onError();
                }
            }
        });

    }

    @Override
    public void registerCallback(IHomeCallBack callBack) {
        this.mCallback = callBack;
    }

    @Override
    public void unregisterCallback(IHomeCallBack callBack) {
        mCallback = null;
    }
}
