package com.xjm.ssme.dao;

import org.springframework.stereotype.Repository;

import com.xjm.ssme.pojo.UserT;


public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserT record);

    int insertSelective(UserT record);

    UserT selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserT record);

    int updateByPrimaryKey(UserT record);
}