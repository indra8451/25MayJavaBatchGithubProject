package com.beans.MultipleBeansOfSameClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AdditionCalculatorofNumbers {

	
	private Addition addition;
	
	public Addition getAddition() {
		return addition;
	}



	public void setAddition(Addition addition) {
		this.addition = addition;
	}



	public void addition() {
		
		addition.Makeaddition();
	}
}
