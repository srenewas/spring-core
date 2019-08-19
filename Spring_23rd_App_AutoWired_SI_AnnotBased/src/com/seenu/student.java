package com.seenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class student {
	
	@Autowired
	//@Qualifier("add")
	private address address;
	
	@Value("seenu")
	String Name;
	
	@Value ("9000980504")
	String Mobile;

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	@Override
	public String toString() {
		return "student [address=" + address + ", Name=" + Name + ", Mobile=" + Mobile + "]";
	}
}
	
	