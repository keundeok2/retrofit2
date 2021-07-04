package com.kkd.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kkd.client.httpclient.TestClient;
import com.kkd.client.vo.CommonResponse;
import com.kkd.client.vo.CommonResult;
import com.kkd.client.vo.User;

import lombok.extern.slf4j.Slf4j;
import retrofit2.Response;

@Slf4j
@Service
public class CommonService {

	@Autowired
	private TestClient client;
	
	public CommonResult clientTest() throws Exception {
		
		Response<CommonResponse<CommonResult>> response = client.getCommonResult("token_1234").execute();
		log.info("response body : {}", response.body());
		
		Response<CommonResponse<User>> response1 = client.getPath("kkd", 1234).execute();
		log.info("response1 body : {}", response1.body());
		
		Response<CommonResponse<CommonResult>> response2 = client.postUser(new User("kkd", "a1234", "01022269883")).execute();
		log.info("response1 body : {}", response2.body());
		
		Response<CommonResponse<CommonResult>> response3 = client.query("pathname", "kkd", "a1234").execute();
		log.info("response3 body : {}", response3.body());
		
		/*
		if ( response.isSuccessful() && response.body().getServiceCode() == 100 ) {
			log.info("success");
			return response.body().getResult();
		} else {
			log.info("failed");
			return null;
		}
		*/
		
		return null;
		
	}
	
}
