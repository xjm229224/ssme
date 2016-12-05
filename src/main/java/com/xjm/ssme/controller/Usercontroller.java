package com.xjm.ssme.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xjm.ssme.pojo.UserT;
import com.xjm.ssme.service.IUserService;


@Controller  
@RequestMapping("/user")  
public class Usercontroller {

	@Autowired
	private IUserService userService;
	
	@Test
	@RequestMapping(value="/add")
	public void addUser(){
		UserT u = new UserT();
		u.setId(2);
		u.setAge(12);
		u.setPassword("123");
		u.setUserName("小明");
		userService.addUser(u);
	}
	
	
	
}
