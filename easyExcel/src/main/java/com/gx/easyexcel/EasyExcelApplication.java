package com.gx.easyexcel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gx.easyexcel.mapper")
@SpringBootApplication
public class EasyExcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyExcelApplication.class, args);
	}

}
