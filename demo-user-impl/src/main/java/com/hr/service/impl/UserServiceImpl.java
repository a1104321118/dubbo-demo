package com.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hr.mapper.UserMapper;
import com.hr.model.User;
import com.hr.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Transactional
	@Override
	public User selectByUserId(int id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	
}
