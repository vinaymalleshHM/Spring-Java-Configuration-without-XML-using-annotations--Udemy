package com.udemy.spring.springjavaconfiguraion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Service {

	@Autowired
	private Dao dao;

	public void init() {
		System.out.println("init()");
	}
	
	public void destroy() {
		System.out.println("destroy()");
	}
	
	public void save() {
		dao.create(); 
	}

}
