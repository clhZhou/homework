package com.upluis.homework.spring.v1.demo.demo.service.impl;

import com.gupaoedu.demo.service.IDemoService;
import com.gupaoedu.mvcframework.annotation.GPService;

/**
 * 核心业务逻辑
 */
@GPService
public class DemoService implements IDemoService{

	public String get(String name) {
		return "My name is " + name + ",from service.";
	}

}
