package com.seenu;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		context.start(); // startevent is recieved
		context.stop(); // stopevent is recieved
		context.refresh(); // here refresh the particular event
		context.close(); // here close the event  even if your add start the event it will not start
		context.start(); // start event is recieved
		context.stop(); // stop event is recieved
		
		System.out.println();
		
		context.refresh(); // here refresh the particular event
		context.start(); // startevent is recieved
		context.stop(); // stopevent is recieved

	}

}
