package com.tns.Interface;

interface  Demo1
{
	int a=10;
	static void display()
	{
		System.out.println("Static Method");
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		Demo1.display();
	
	}
	

}
