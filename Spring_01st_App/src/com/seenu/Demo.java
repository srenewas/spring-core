package com.seenu;

import java.io.ObjectInputStream.GetField;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
	public static void main(String[] args) {
        // normal obj creation..........
		Bean B = new Bean();
		B.setId(111);
		B.setName("suvvy");
		B.setGender('m');
		
		System.out.println("Bean class Details........");
		System.out.println("      BEANID   BNAME    BGENDER");
		System.out.println(B);
	
		//spring obj creation...........
		//inversion of control....(I O C)
		//1ST WAY BY USING BEANFACTORY........................
		Resource resource = new ClassPathResource("Bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);// spring container which shall parse the xml file and to construct the object
		
		Bean b1 = (Bean) factory.getBean("sri");
		Bean b2 = (Bean) factory.getBean("nu");
		
		System.out.println("with using beanfactory container.......................................................");
		System.out.println("Bean Details......"+b1);
		System.out.println("Bean Details......"+b2);
		
		//2ND WAY BY USING APPLICATION CONTEXT......(MOST SUGGESTABLE)
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		Bean bb1 = (Bean) context.getBean("sri");
		Bean bb2 = (Bean) context.getBean("nu");
		
		System.out.println();
		System.out.println("with using applcontext container.......................................................");
		System.out.println("Bean Details......"+bb1);
		System.out.println("Bean Details......"+bb2);
		
		

		
		
		
	}

}
