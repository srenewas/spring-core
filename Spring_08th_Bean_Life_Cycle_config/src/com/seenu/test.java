package com.seenu;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("****************************************************************");
		student student = (student) context.getBean("xxx");
		
		
		//ClassPathXmlApplicationContext con = (ClassPathXmlApplicationContext)context;
		context.close();			
	}
}
