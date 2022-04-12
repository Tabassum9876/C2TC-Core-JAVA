package com.tns.abstractclass;

abstract class Bike1{
	Bike1()
	{
		System.out.println("Bike is Created");
	}
	abstract void run();
	void ChangeGear() {
		System.out.println("Gear Changed");
	}
}
class Honda1 extends Bike1{
	void run() {
		System.out.println("Running Safely");
	}
}
public class Example4 {

	public static void main(String[] args) {
		Honda1 h=new Honda1();
		h.run();
		h.ChangeGear();
	
	}

}
