package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("**************************************************************");
		//bank bank = (bank)context.getBean("bank");
		
	}

}
