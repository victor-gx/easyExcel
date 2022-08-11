package com.gx.demo1.mapper;

import com.gx.demo1.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


@Mapper
public interface UserMapper {

	void addUser(User sysUser);

	int updateUserByName(User sysUser);

	int selectByName(String name);
}
