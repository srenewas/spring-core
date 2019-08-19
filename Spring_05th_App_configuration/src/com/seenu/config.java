package com.seenu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class config {
	@Bean
	public employee employee() {
		return new employee();
		
	}
	@Bean
	@Lazy
	public student student() {
		return new student();
	}

}
