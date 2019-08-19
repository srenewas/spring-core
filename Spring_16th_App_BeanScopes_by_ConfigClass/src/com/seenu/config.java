package com.seenu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class config {
	@Bean
	@Scope("prototype")
	public employee employee() {
		return new employee();
		
	}
	@Bean
	@Scope("singleton")
	public student student() {
		return new student();
		
	}

}
