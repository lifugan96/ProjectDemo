package com.glf.rxjavademo.presenter.impl;

import com.glf.rxjavademo.model.Api;
import com.glf.rxjavademo.model.domain.Categories;
import com.glf.rxjavademo.presenter.IHomePresenter;
import com.glf.rxjavademo.utils.LogUtils;
import com.glf.rxjavademo.utils.RetrofitManager;
import com.glf.rxjavademo.view.IHomeCallBack;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HomePresenterImpl implements IHomePresenter {

    private IHomeCallBack mCallback;

    @Override
    public void getCategories() {
        Retrofit retrofit = RetrofitManager.getInstance().getRetrofit();
        Api api = retrofit.create(Api.class);
        Call<Categories> categories = api.getCategories();
        categories.enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(Call<Categories> call, Response<Categories> response) {
                Categories categories = response.body();
                LogUtils.d(HomePresenterImpl.this, "response--->" + categories.toString());
                if (mCallback != null) {
                    mCallback.onCategoriesLoaded(categories);
                }
            }

            @Override
            public void onFailure(Call<Categories> call, Throwable t) {

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
