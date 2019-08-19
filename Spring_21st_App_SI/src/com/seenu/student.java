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
	
	@Override
	public String toString() {
		return "student [Name=" + Name + ", Address=" + Address + ", Gender=" + Gender + ", MobileNo="
				+  "]";
	}
	
}
