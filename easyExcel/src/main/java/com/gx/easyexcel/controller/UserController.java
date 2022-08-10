package com.gx.easyexcel.controller;

import com.gx.easyexcel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UserController {

	@Autowired
	UserService userServiceImpl;

	@GetMapping(
			value = "/downloadExcel",
			produces = {"application/vnd.ms-excel;charset=UTF-8"}
	)
	@ResponseBody
	public void downloadExcel(HttpServletResponse response) throws IOException {
		userServiceImpl.downloadExcel(response);
	}
}