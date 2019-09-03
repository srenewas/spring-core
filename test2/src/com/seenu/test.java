package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test{
	 public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		bean b = (bean) context.getBean("bean");
		b.display();
	}
	}

