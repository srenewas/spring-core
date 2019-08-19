package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test { 
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");
		student st = (student) context.getBean("h3");
		//employee emp = (employee) context.getBean("e3");
	
		System.out.println("****************************************************************");
		st.hello();
		//emp.hi();
	}

}
