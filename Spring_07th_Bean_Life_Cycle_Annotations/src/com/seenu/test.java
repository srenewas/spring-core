package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("********************************************************");
		
		ClassPathXmlApplicationContext con = (ClassPathXmlApplicationContext)context;
		con.close();
		
	}

}
