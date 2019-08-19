package com.seenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class student {
	@Autowired
	//@Qualifier("add")
	private address address;
	
	public student() {
	}
	public student(address address) {
		//System.out.println("CONSTRUCTOR BASED AUTOWIRING ");
		this.address = address;
	}
	void display() {
		System.out.println("STUDENT DETAILS");
		System.out.println(address);
	}
	
}
