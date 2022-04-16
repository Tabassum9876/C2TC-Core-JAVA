package com.tns.finalkeyword;

//Final Variable

class Bike
{
	final int speedlimit=90;
	void run()
	{
		System.out.println(speedlimit);
	}
}
public class Variable {

	public static void main(String[] args) {
		Bike b= new Bike();
		b.run();
		System.out.println(b.speedlimit);
	
	}

}
