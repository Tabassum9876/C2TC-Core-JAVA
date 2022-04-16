package com.tns.Interface;

interface Bike{
	void getMileage();
}
class R15 implements Bike
{
	public void getMileage()
	{
		System.out.println("Mileage is 40 km/L");
	}
}

class Example2 {

	public static void main(String[] args) {
		R15 bike = new R15();
		bike.getMileage();
	}

}
