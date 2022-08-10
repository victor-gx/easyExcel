package com.gx.excel;


import com.alibaba.excel.EasyExcel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EasyTest {
	String PATH = "ExcelCreate\\";

	//模拟写入数据
	private List<DemoData> data() {
		java.util.List<DemoData> list = new ArrayList<DemoData>();
		for (int i = 0; i < 10; i++) {
			DemoData data = new DemoData();
			data.setString("字符串" + i);
			data.setDate(new Date());
			data.setDoubleData(0.56);
			list.add(data);
		}
		return list;
	}

	//根据ist写 excel
	@Test
	public void simplewrite() {
		String fileName = PATH + "EasyTest.xlsx";
		//这里需要指定写用哪个 class去写，然后写到第一个 sheet，名字为模板然后文件流会自动关闭
		//write(fileName,格式类)
		//sheet（表名）
		//doWrite（数据）
		EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data());
	}

	@Test
	public void simpleRead() {
		// 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
		// 写法1：
		String fileName = PATH + "EasyTest.xlsx";
		// 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
		EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).sheet().doRead();
		// 写法2：
		// fileName = TestFileUtil.getPath() + "demo" + File.separator + "demo.xlsx";
		// ExcelReader excelReader = null;
		// try {
		// 	excelReader = EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).build();
		// 	ReadSheet readSheet = EasyExcel.readSheet(0).build();
		// 	excelReader.read(readSheet);
		// } finally {
		// 	if (excelReader != null) {
		// 		// 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
		// 		excelReader.finish();
		// 	}
		// }
	}
}
