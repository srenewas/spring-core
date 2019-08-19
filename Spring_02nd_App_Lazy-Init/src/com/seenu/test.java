package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("parse.xml");
		System.out.println("--------------------------------");

		student s =(student) context.getBean("xxx");
		employee e = (employee) context.getBean("ddd");
		
	}

}
