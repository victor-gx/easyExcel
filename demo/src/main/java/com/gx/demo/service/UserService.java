package com.gx.demo.service;

import com.gx.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserService {

	int insert(User user);

}
