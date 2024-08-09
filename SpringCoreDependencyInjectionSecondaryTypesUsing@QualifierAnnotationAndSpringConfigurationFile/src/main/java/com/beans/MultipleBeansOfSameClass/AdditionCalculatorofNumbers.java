package com.beans.MultipleBeansOfSameClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AdditionCalculatorofNumbers {

	@Autowired
	@Qualifier("add13")

	/*
	 * if if we didnt Specifying @@Qualifier("add2") the it will generate below
	 * error No qualifying bean of type
	 * 'com.beans.MultipleBeansOfSameClass.Addition' available: expected single
	 * matching bean but found 5: add1,add2,add3,add13,add15
	 */
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
