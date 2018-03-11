package cn.com.onlineqa.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.onlineqa.interfaces.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService UserService;
	
	@RequestMapping("/findusers")
	public String userList() {
		
		return "";
	}
}
