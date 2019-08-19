package com.seenu;

import org.springframework.beans.factory.BeanNameAware;
public class employee implements BeanNameAware {
	
	private String bean;
	
	public void hi() {
	//	System.out.println("HELLO SUHAS .................");
		
		if(bean.equals("e3")) {
			System.out.println("BEAN NAME AWARE CREATED FOR SUVVY..................");
		}
	}
	@Override
	public void setBeanName(String beanname) {
		this.bean = bean;
	}
}
