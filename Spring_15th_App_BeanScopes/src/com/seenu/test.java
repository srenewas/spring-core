package com.seenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
		student s1 = (student) context.getBean("stud");
		student s2 = (student) context.getBean("stud");
		student s3 = (student) context.getBean("stud");
		student s4 = (student) context.getBean("stud");
		student s5 = (student) context.getBean("stud");
		
		System.out.println();
		System.out.println("****STUDENT CLASS****************************************************************************************************");
		System.out.println();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		employee e1 = (employee) context.getBean("emp");
		employee e2 = (employee) context.getBean("emp");
		employee e3 = (employee) context.getBean("emp");
		employee e4 = (employee) context.getBean("emp");
		employee e5 = (employee) context.getBean("emp");
		employee e6 = (employee) context.getBean("emp");
		
		System.out.println();
		System.out.println("****EMPLOYEE CLASS****************************************************************************************************");
		System.out.println();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		
	}

}
