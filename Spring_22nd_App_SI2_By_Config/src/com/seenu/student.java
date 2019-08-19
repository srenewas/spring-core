package com.seenu;

public class student {
	String Name;
	String Address;
	char Gender;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	public void display() {
		setName("suhas");
		setAddress("hyderabad");
		setGender('M');
		System.out.println("STUDENT DETAILS ARE");
		System.out.println("*******************************************");
		System.out.println("NAME    :"+Name);
		System.out.println("ADDRESS :"+Address);
		System.out.println("GENDER  :"+Gender);
		
	}
	}
	
