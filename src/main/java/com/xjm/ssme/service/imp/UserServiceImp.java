package com.xjm.ssme.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjm.ssme.dao.IUserDao;
import com.xjm.ssme.pojo.UserT;
import com.xjm.ssme.service.IUserService;

@Service
public class UserServiceImp implements IUserService{

	@Autowired
	private IUserDao userDao;

	public void addUser(UserT record) {
		userDao.insert(record);
	}
	
}
