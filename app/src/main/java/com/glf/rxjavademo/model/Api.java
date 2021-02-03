package com.glf.rxjavademo.model;

import com.glf.rxjavademo.model.domain.Categories;
import com.glf.rxjavademo.model.domain.NormalCategory;
import com.glf.rxjavademo.model.domain.NormalContent;
import com.glf.rxjavademo.model.domain.PostFileRequest;
import com.glf.rxjavademo.model.domain.Repp;
import com.glf.rxjavademo.model.domain.ResultInfo;
import com.glf.rxjavademo.model.domain.ShoppingUserInfo;
import com.glf.rxjavademo.model.domain.UserInfo;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface Api {


//    @GET("GetXMRepp")
//    Call<ResultInfo<Repp>> getRepp();
//
//
//    @GET("LoginNew")
//    Call<ResultInfo<UserInfo>> login(@Query("AppID") String appid,
//                                     @Query("sLoginID") String account,
//                                     @Query("sPassWord") String password,
//                                     @Query("dbName") String db);
//
//    @GET("LoginNew")
//    Call<ResultInfo<UserInfo>> login(@QueryMap Map<String, Object> params);
//
//    @POST("/user/login")
//    Call<ShoppingUserInfo> loginPost(@QueryMap Map<String, Object> params);
//
//    @Multipart
//    @POST("/file/upload")
//    Call<PostFileRequest> postFile(@Part MultipartBody.Part part);
//
//    //多个文件
//    @Multipart
//    @POST("/file/upload")
//    Call<PostFileRequest> postFile(@Part List<MultipartBody.Part> parts);
//
//
//    //文件与参数
//    @Multipart
//    @POST("/file/upload")
//    Call<PostFileRequest> postFile(@Part List<MultipartBody.Part> parts, @PartMap Map<String, Object> partMap);
//
//    @Streaming
//    @GET
//    Call<ResponseBody> dowFile(@Url String url);


    @GET("discovery/categories")
    Call<Categories> getCategories();


    @GET("recommend/categories")
    Call<NormalCategory> getNormalCategory();

    @GET("recommend/categoryId")
    Call<NormalContent> getNormalContent(@Query("categoryId") int categoryId);
}
