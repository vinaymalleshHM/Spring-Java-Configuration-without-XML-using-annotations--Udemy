package com.udemy.spring.springjavaconfiguraion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {

	
	// moving to DaoCinfig
//	@Bean
//	public Dao dao() {
//		return new Dao();
//	}

	@Bean(initMethod = "init" ,destroyMethod = "destroy")
	@Scope("prototype")
	public Service service() {
		return new Service();
	}

}
