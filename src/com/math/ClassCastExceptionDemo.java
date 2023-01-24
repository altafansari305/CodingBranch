package com.math;

class Animal{
	
}

class Dog extends Animal{
	
	
}

class Cat extends Animal{
	
	
}


public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		Animal d=new Dog();
		
		Animal c=new Cat();
		
		//Cat cat1=new Dog();
		
		Cat cat1= (Cat) a; 
		
		System.out.println("Done !!!");

	}

}
