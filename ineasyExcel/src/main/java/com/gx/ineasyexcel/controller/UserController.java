package com.gx.ineasyexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.gx.ineasyexcel.entity.User;
import com.gx.ineasyexcel.listener.UserListener;
import com.gx.ineasyexcel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("upload")
	public String upload(MultipartFile file) throws IOException {
		EasyExcel.read(file.getInputStream(), User.class,new UserListener(userService)).sheet().doRead();
//        sheet()默认是0
		return "success";
	}

}
