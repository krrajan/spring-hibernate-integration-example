package com.spring.autowired.exp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("autowiredExp")
public class AutowiredExp {
	
	@Autowired()
	@Qualifier("cat")
	private Animal animal;
	
	
	@Autowired()
	public AutowiredExp(@Qualifier("cat")Animal animal) {
		animal.getAnimalName();
	}

	public void displayAnimalName(){
		System.out.println("Animal example");
		animal.getAnimalName();
	}

	@Autowired()
	public void setAnimal(@Qualifier("dog")Animal animal) {
		this.animal = animal;
	}
	
	
}
