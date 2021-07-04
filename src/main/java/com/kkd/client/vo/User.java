package com.kkd.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private String id;
	
	private String password;
	
	private String phone;
}
