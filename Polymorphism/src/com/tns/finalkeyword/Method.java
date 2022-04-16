package com.tns.finalkeyword;

//Final Method

class Car
{
	final void run()
	{
		System.out.println("running");
	}
}
class Maruti extends Car
{
	{
		System.out.println("running safely with 100kmph");
	}
}

public class Method {

	public static void main(String[] args) {
		Maruti m=new Maruti();
		m.run();
	
	}

}
