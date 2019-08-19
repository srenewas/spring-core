package com.seenu;

public class Student {
	private Address address;

	public Student(Address address) {
		this.address = address;
	}
	public void get() {
		System.out.println("student details are......"+address);
		address.display();
	}
}
