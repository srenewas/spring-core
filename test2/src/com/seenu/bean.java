package com.seenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bean")
public class bean{
	
	@Autowired
	public bean2 bean2;
	
	public bean() {
		// TODO Auto-generated constructor stub
	}

	public bean(com.seenu.bean2 bean2) {
		super();
		this.bean2 = bean2;
	}
	
	public void display() {
		System.out.println("AND THE RESULTS ARE...........................");
		System.out.println(bean2);
	}
	
}
