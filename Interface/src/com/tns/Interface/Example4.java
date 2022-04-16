
package com.tns.Interface;

interface Vehicle
{
	void Engine();
}
interface Bike1 extends Vehicle
{
	void getMileage();
}
class R14 implements Bike1
{
	public void Engine()
	{
		System.out.println("Liquid-cooled SOHC 4-valve fuel-injected engine");
	}
	public void getMileage() 
	{
		System.out.println("Mileage is 40 km/L");
	}
}
public class Example4 {

	public static void main(String[] args) {
		R14 bike=new R14();
		bike.getMileage();
		bike.Engine();
	}

}
