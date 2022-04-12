package com.tns.abstractclass;

abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run()
	{
		System.out.println("Running Safely");
	}
}

public class Example1 {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();

	}

}
