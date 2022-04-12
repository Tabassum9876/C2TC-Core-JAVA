package com.tns.abstractPracticeQues;

abstract class A{
	abstract void abstract_method();
	public void normal()
	{
		System.out.println("I am Inevitable");
	}
}
 class B extends A{
	void abstract_method()
	{
		System.out.println("I am Ironman");
	}
}
public class Ques4 {

	public static void main(String[] args) {
		B b=new B();
		b.abstract_method();
		b.normal();
		
		
	}

}
