package com.tns.superkeyword;

//TO invoke immediate parent class Constructor

class Animal2
{
	Animal2()
	{
		System.out.println("Animal is created");
	}
}
class Dog2 extends Animal2
{
	Dog2()
	{
		super();
		System.out.println("Dog is created");
	}
}


public class Constructor {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
		
	}

}
