package com.cn.hnust.dao;

import org.springframework.stereotype.Component;

import com.cn.hnust.pojo.User;

@Component(value="userDao")
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}