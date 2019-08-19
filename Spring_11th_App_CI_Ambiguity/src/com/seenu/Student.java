package com.seenu;

public class Student {
    int id;
    String name;
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public Student(String name,int id) {
		this.name = name;
		this.id = id;
	}
	public void display() {
		System.out.println("STUDENT DETAILS");
		System.out.println("***********************************");
		System.out.println("student id  :"+id);
		System.out.println("student name: "+name);
	}
	
    
}
