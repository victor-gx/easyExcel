package com.gx.easyexcel.service;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gx.easyexcel.entity.User;
import com.gx.easyexcel.mapper.UserMapper;
import com.gx.easyexcel.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;

	@Override
	public void downloadExcel(HttpServletResponse response) throws IOException {
		String filename = URLEncoder.encode("myExcel","utf-8");

		response.setContentType("application/vnd.ms-excel");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Content-Disposition","attachment;filename=" + filename + ".xlsx");

		/**
		 *  EasyExcel的写文件操作，data()方法用来查询数据库数据返回list。
		 * sheet为excel的工作表表名
		 */
		EasyExcel.write(response.getOutputStream(), User.class).sheet("sheet1").doWrite(data());

	}

	private List<User> data(){
		QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
		List<User> list = userMapper.downloadExcel(queryWrapper);
		return list;
	}

}