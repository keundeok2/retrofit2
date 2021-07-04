package com.kkd.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kkd.client.service.CommonService;
import com.kkd.client.vo.CommonResponse;
import com.kkd.client.vo.CommonResult;

import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;

@Slf4j
@Controller
public class CommonController {

	@Autowired
	private CommonService commonService;
	
	@GetMapping("/test")
	public ResponseEntity<?> test() throws Exception{
		
		
		return ResponseEntity.ok(commonService.clientTest());
	}
	
}
