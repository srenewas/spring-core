package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		student student = (com.seenu.student) context.getBean("student");
		
		student.getName();
		student.getAddress();
		student.getGender();
		student.display();
	}

}
