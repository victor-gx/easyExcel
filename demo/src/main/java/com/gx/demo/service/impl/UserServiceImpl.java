package com.gx.demo.service.impl;

import com.gx.demo.entity.User;
import com.gx.demo.mapper.UserMapper;
import com.gx.demo.service.UserService;
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
