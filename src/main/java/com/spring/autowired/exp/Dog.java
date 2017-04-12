package com.spring.autowired.exp;

import org.springframework.stereotype.Service;

@Service("dog")
public class Dog implements Animal{

	public void getAnimalName() {
		System.out.println("DOG: "+ this);
	}
	

}
