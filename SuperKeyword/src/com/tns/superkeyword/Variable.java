package com.tns.superkeyword;

//To refer immediate parent class instance Variable

class Animal
{
	String color="White";
}
class Dog extends Animal
{
	String color="Black";

 public void printcolor()
{
	System.out.println(color);           //prints color of DOg class
	System.out.println(super.color);     //prints color of Animal class
	}
}

public class Variable {

	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(d.color);
		d.printcolor();
		
	}

}
