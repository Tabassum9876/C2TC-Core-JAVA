package com.tns.le;

interface Sayable1{
	public void say();
}
public class LamdaExWithOutParameter {

	public static void main(String[] args) {
		Sayable1 s=()->
		{System.out.println("I have nothing to say");
		System.out.println("I have nothing to say");
		System.out.println("I have nothing to say");
		};	
		s.say();
	}

}
