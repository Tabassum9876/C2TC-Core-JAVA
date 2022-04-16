package com.tns.polymorphism;

//MethodOverloading: Changing data types of arguments

class Addition
{
	int add(int a,int b) 
	{
	return a+b;	
	}
	float add(float a,int b)    
	//double add(double a, double b)
	{
		return a+b;
	}
}
public class MethodOverloadingex2 {

	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println(a.add(4, 4));
		System.out.println(a.add(4.7f, 6));
	
	}

}
