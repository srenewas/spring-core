package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		System.out.println("****************************************************************");
		//student student = (com.seenu.student) context.getBean("student");// here student object is lazy so we must call that class otherwise its not excuted
	}

}
