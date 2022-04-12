package com.tns.abstractPracticeQues;

abstract class Base{
	void fun()
	{
		System.out.println("Abstract class method");
	}
}
class Derived extends Base{}

public class Ques3 {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.fun();
		
	}

}
