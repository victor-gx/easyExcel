package com.gx.ineasyexcel.service.impl;

import com.gx.ineasyexcel.entity.User;
import com.gx.ineasyexcel.mapper.UserMapper;
import com.gx.ineasyexcel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}
}
