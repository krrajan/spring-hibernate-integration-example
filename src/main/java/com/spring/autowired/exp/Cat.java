package com.spring.autowired.exp;

import org.springframework.stereotype.Service;

@Service("cat")
public class Cat implements Animal{

	public void getAnimalName() {
		System.out.println("CAT: "+ this);
	}
	

}
