package com.gx.easyexcel.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gx.easyexcel.util.LocalDateTimeConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	/**
	 *  @ExcelIgnore 导出时忽略该项
	 */
	@ExcelIgnore
	private Integer id;

	/**
	 * @ExcelProperty导出时输出项，value表头为姓名，index输出的顺序
	 */
	@ExcelProperty(value="姓名",index=0)
	private String name;

	@ExcelProperty(value="年龄",index=1)
	private Integer age;

	/**
	 * @ColumnWidth(25) 列宽度
	 * converter = LocalDateTimeConverter.class 为工具类，
	 * 用于转换LocalDateTime时间
	 */
	@ColumnWidth(25)
	@ExcelProperty(value="创建时间",index=2,converter = LocalDateTimeConverter.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	//@ApiModelProperty("创建时间")
	private LocalDateTime createTime;

}
