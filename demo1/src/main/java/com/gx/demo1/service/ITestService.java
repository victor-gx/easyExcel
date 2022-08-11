package com.gx.demo1.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

@Mapper
public interface ITestService {

	boolean batchImport(String fileName, MultipartFile file) throws Exception;

}
