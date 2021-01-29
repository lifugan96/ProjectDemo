package com.glf.rxjavademo.app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

//    private static Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("http://47.99.97.108:4008//WSReport.asmx/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.2.127:9102")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public static Retrofit getRetrofit() {
        return retrofit;
    }

}
