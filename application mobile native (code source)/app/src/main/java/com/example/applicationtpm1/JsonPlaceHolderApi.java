package com.example.applicationtpm1;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface JsonPlaceHolderApi {
    @GET("sms")
    Call<List<Post>> getPosts();
}
