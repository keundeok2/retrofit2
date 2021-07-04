package com.kkd.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kkd.client.httpclient.TestClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class ClientConfig implements WebMvcConfigurer{
	
	
	@Bean
	public Retrofit retrofit() {
		return new Retrofit.Builder()
				.baseUrl("http://localhost:18080/")
				.addConverterFactory(GsonConverterFactory.create())
				.build();
	}
	
	@Bean
	public TestClient testClient() {
		
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("http://localhost:18080/")
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		
		return retrofit.create(TestClient.class);
		
		
	}

}
