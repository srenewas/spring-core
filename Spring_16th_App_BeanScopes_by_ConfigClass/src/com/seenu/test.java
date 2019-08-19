package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		System.out.println();
		System.out.println("****STUDENT CLASS****************************************************************************************************");
		System.out.println();
	
		student s1 = (com.seenu.student)context.getBean("student");
		student s2 = (com.seenu.student)context.getBean("student");
		student s3 = (com.seenu.student)context.getBean("student");
		student s4 = (com.seenu.student)context.getBean("student");
		student s5 = (com.seenu.student)context.getBean("student");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println();
		System.out.println("****EMPLOYEE CLASS****************************************************************************************************");
		System.out.println();
		
		employee e1 = (com.seenu.employee) context.getBean("employee");
		employee e2 = (com.seenu.employee) context.getBean("employee");
		employee e3 = (com.seenu.employee) context.getBean("employee");
		employee e4 = (com.seenu.employee) context.getBean("employee");
		employee e5 = (com.seenu.employee) context.getBean("employee");
		employee e6 = (com.seenu.employee) context.getBean("employee");
		
		System.out.println();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		
	}

}
