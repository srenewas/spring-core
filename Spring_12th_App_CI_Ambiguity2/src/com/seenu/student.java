package com.seenu;

public class student {
	int id;
	String name;
	char gender;
	public student(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public void display() {
		System.out.println("****STUDENT DETAILS****");
		System.out.println("******************************");
		System.out.println("student id    :"+id);
		System.out.println("student name  :"+name);
		System.out.println("student gender:"+gender);
	}

}
