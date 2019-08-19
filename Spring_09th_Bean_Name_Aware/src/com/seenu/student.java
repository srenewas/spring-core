package com.seenu;

import org.springframework.beans.factory.BeanNameAware;
public class student implements BeanNameAware {

	private String beanname;
	public void hello() {
//		System.out.println("STUDENT OBJECT........");

		if(beanname.equals("h3")) {
			System.out.println("BEAN NAME AWARE CREATED FOR SEENU..................");
		}
	}
	
	@Override
	public void setBeanName(String beanname) {
		this.beanname = beanname;
	}
	

}
