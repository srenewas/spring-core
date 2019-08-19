package com.seenu;

public class student {
	
	public address address;
	
	public student() {
	}
	
	public student(address address) {
		System.out.println("cunstructor based");
		this.address = address;
	}
	public void display() {
		System.out.println(address);
	}

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}
	
}		