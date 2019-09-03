package com.seenu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("add")
public class bean2{
	
	@Value("seenu")
	String name;
	
	@Value("hyderabad")
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "bean2 [name=" + name + ", address=" + address + "]";
	}
	
	
}
