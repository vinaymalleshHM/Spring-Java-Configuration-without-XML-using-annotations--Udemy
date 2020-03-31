package com.udemy.spring.springjavaconfiguraion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
	
	@Bean
	public Dao dao() {
		return new Dao();
	}

}
