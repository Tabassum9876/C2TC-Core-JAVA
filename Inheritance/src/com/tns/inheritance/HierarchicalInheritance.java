package com.tns.inheritance;

class Animal2{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog2 extends Animal{
	void bark()
	{
		System.out.println("Barking....");
	}
}
class Cat extends Animal{
	void meow()
	{
		System.out.println("Meowing...");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
		Cat c=new Cat();
		d.bark();
		d.eat();
		c.meow();
		c.eat();

		
	}

}
