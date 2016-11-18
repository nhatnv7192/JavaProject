package com.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class getBeanNew {
	private ApplicationContext context;
	public Object getBean(String bean)
	{
		context = new ClassPathXmlApplicationContext("classpath*:root-context.xml");
		return context.getBean(bean);
	}
}
