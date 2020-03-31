package com.udemy.spring.springjavaconfiguraion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Dao.class);
		//		context.register(Dao.class);//to register the multiple class => AnnotationConfigApplicationContext


		//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		//		Dao dao = context.getBean(Dao.class);
		//		dao.create();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service service = context.getBean(Service.class);
		service.save();

		Service service1 = context.getBean(Service.class);
		System.out.println("HashCode service " + service.hashCode());
		System.out.println("HashCode service1 " + service1.hashCode());
		
		context.close();// to execute destory method

	}

}
