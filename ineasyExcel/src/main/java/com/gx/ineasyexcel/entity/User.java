package com.gx.ineasyexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 619270056917451517L;

	//  @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")这里用string 去接日期才能格式化。我想接收年月日格式
//  @ColumnWidth(20)设置宽度
	@ExcelProperty(value = "id",index = 0)
	private Integer id;

	@ExcelProperty(value = "时间",index = 1)
	@DateTimeFormat("yyyy-MM-dd HH:mm:ss")
	private String stat_month;

}
