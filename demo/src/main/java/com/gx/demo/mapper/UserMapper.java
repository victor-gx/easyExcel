package com.gx.demo.mapper;

import com.gx.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
	int insert(User user);
}
