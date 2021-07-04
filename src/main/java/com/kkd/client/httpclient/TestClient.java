package com.kkd.client.httpclient;

import com.kkd.client.vo.CommonResponse;
import com.kkd.client.vo.CommonResult;
import com.kkd.client.vo.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TestClient {

	@GET("common/result")
	Call<CommonResponse<CommonResult>> getCommonResult(@Header("token") String token);
	
	@GET("common/{id}/{password}")
	Call<CommonResponse<User>> getPath(@Path("id") String id, @Path("password") int password);
	
	@POST("common/post")
	Call<CommonResponse<CommonResult>> postUser(@Body User user);
	
	@GET("common/query/{path}")
	Call<CommonResponse<CommonResult>> query(@Path("path") String path, @Query("id") String id, @Query("password") String password);
	
}
