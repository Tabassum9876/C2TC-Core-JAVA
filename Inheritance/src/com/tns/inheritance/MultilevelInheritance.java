package com.tns.inheritance;

class Animal1{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog1 extends Animal1{
	void bark()
	{
		System.out.println("Barking...");		
	}
}
class BabyDog extends Dog1{
	void Weep()
	{
		System.out.println("Weeping....");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog d=new BabyDog();
		d.bark();
		d.eat();
		d.Weep();
	}

}
