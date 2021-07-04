package com.kkd.client.vo;

import lombok.Data;

@Data
public class CommonResponse<T> {

	private int serviceCode;
	
	private String serviceMsg;
	
	private T result;
	
}
