package com.tns.abstractPracticeQues;

abstract class Animal{
	abstract void eat();
}
class Herbivores extends Animal {
	void eat()
	{
		System.out.println("I am a Vegetarian");
	}
}
class Carnivores extends Animal{
	void eat()
	{
		System.out.println("I am non Vegetarian");
		}
}
class Omnivores extends Animal{
	void eat() {
		System.out.println("I will Eat both Veg & Non-Veg");
	}
}
public class Ques1 {

	public static void main(String[] args) {
		Animal goat=new Herbivores();
		Animal tiger=new Carnivores();
		Animal bear=new Omnivores();
		goat.eat();
		tiger.eat();
		bear.eat();
	}
	}

