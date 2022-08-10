package com.gx.easyexcel.service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface UserService {
	/**
	 *	这里使用到pom.xml的servlet-api依赖，负责向客户端(浏览器)发送响应
	 */
	void downloadExcel(HttpServletResponse response) throws IOException;
}