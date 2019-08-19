package com.seenu;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class student implements InitializingBean,DisposableBean{    // if u want to init & destroy the object by using interfaces 

	@Override
	public void destroy() throws Exception {
       System.out.println("DESTROY SUCCESSFULLY......");		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
        System.out.println("INIT SUCCESSFULLY........");		
	}

}
