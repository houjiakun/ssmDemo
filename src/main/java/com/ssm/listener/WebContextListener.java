package com.ssm.listener;

import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

public class WebContextListener extends org.springframework.web.context.ContextLoaderListener {
	
	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		if (!printKeyLoadMessage()){
			return null;
		}
		return super.initWebApplicationContext(servletContext);
	}
	
	/**
	 * 获取Key加载信息
	 */
	private static boolean printKeyLoadMessage(){
		StringBuilder sb = new StringBuilder();
		sb.append("\r\n======================================================================\r\n");
		sb.append("\r\n    欢迎使用  - Powered By http://www.gczj.com.cn\r\n");
		sb.append("\r\n======================================================================\r\n");
		System.out.println(sb.toString());
		return true;
	}
}
