package com.xjm.ssme.dao.imp;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.xjm.ssme.dao.IUserDao;
import com.xjm.ssme.pojo.UserT;
import com.xjm.ssme.util.commonUtil;


@Repository
public class UserDao  extends commonUtil implements IUserDao{

	private SqlSessionTemplate template;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(UserT record) {
		
		return this.template.insert(statment(UserT.class) , record);
	}

	@Override
	public int insertSelective(UserT record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserT selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(UserT record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(UserT record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
