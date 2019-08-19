package com.seenu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class student {
	public student() {
		System.out.println("STUDENT OBJECT CREATED SUCCESSFULLY.......");
	}
	@PostConstruct
	public void m1() {
		System.out.println("OBJ INIT SUCCESSFULLY.............");
	}
	@PreDestroy
	public void m2() {
		System.out.println("OBJ DESTROY SUCCESSFULLY............");
	}

}
