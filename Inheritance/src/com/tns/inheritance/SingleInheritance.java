package com.tns.inheritance;

class Animal {
	void eat()
	{
	System.out.println("eating....");
    }
}

class Dog extends Animal{
	void bark()
	{
		System.out.println("Barking....");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
		
	}

}
