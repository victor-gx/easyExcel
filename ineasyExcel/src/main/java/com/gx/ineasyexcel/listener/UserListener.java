package com.gx.ineasyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.gx.ineasyexcel.entity.User;
import com.gx.ineasyexcel.service.UserService;

import java.util.Map;

public class UserListener extends AnalysisEventListener<User> {

	private UserService userService;

	public UserListener(UserService userService){
		this.userService=userService;
	}

	//  一行行读取excel内容
	@Override
	public void invoke(User user, AnalysisContext analysisContext) {
		System.out.println("开始执行");
		saveData(user);
	}

	private void saveData(User user) {
		userService.insert(user);
		System.out.println("存储成功");
	}
	//  读取表头内容
	@Override
	public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
		System.out.println("表头："+headMap);
	}

	//  读取完成之后
	@Override
	public void doAfterAllAnalysed(AnalysisContext analysisContext) {
		System.out.println("存储完毕");
	}
}