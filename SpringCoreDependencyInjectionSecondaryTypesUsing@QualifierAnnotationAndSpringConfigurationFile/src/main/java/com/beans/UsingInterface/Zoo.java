package com.beans.UsingInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Zoo {

	@Autowired
	@Qualifier("dog")
	private Animal animal;

	public void makeSound() {
		animal.sound();
	}

}
