package com.seenu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class config {
	
	@Bean
	@Lazy
	public bean bean() {
		return new bean();
	}
	
	@Bean
	public bean2 bean2() {
		return new bean2();
	}

}
