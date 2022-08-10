package com.gx.easyexcel.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gx.easyexcel.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 继承Mybatis-plus的BaseMapper,使用QueryWrapper包装类进行对数据的查询
 */
public interface UserMapper extends BaseMapper {
	List<User> downloadExcel(@Param("user") QueryWrapper<User> queryWrapper);
}