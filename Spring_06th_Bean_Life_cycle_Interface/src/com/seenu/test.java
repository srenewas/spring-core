package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		student st = (student) context.getBean("xxx");
		
		ClassPathXmlApplicationContext con = (ClassPathXmlApplicationContext)context;// if you want to destroy the object explicitly by this code
		con.close();
	}

}
