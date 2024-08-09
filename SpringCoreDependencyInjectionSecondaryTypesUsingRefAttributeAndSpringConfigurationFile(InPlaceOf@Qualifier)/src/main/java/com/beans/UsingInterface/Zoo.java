package com.beans.UsingInterface;

public class Zoo {
	
	
	private Animal animal;
	
	
	
	public Animal getAnimal() {
		return animal;
	}



	public void setAnimal(Animal animal) {
		this.animal = animal;
	}



	public void makeSound() {
        animal.sound();
    }

}
