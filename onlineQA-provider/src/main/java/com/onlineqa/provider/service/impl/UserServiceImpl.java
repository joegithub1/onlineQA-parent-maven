package com.onlineqa.provider.service.impl;

import org.springframework.stereotype.Service;

import cn.com.onlineqa.interfaces.service.UserService;

public class UserServiceImpl implements UserService{

	public String sayHello() {
		System.out.println("------------------sayHi-----------");
		return "HelloWorld";
	}

	

}
