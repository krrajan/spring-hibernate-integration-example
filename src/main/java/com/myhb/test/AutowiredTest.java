package com.myhb.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.autowired.exp.AutowiredExp;

public class AutowiredTest {
	public static void main(String[] args) {
	
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/spring-config.xml");

		AutowiredExp autowiredExp=(AutowiredExp) appContext.getBean("autowiredExp");

		
		autowiredExp.displayAnimalName();
	}
		


}
