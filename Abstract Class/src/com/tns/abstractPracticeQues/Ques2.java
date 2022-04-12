package com.tns.abstractPracticeQues;

abstract class Animal2
{
	public abstract void sound();
}
class Lion extends Animal2{
	public void sound() 
	{
		System.out.println("Roar");
	}
}
public class Ques2 {

	public static void main(String[] args) {
		Animal2 obj=new Lion();
		obj.sound();

}
}