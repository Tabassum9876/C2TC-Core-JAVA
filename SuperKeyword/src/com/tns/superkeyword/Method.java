package com.tns.superkeyword;

//To invoke immediate parent class method

class Animal1
{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}
class Dog1 extends Animal1
{
	void eat()
	{
		System.out.println("DOg is eating bread...");
	}
void bark() {
	System.out.println("Dog is Barking...");
}

void work()
{
   super.eat();
   System.out.println("Dog is Working...");

}
}
public class Method {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
	    d.bark();
	    d.eat();
	    d.work();
	}

}

