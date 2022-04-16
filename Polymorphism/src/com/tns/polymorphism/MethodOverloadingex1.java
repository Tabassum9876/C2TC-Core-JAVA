package com.tns.polymorphism;

//MethodOverloading:Changing no. of arguments

class Adder
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b, int c)
	{
		return a+b+c;
	}
}

public class MethodOverloadingex1 {

	public static void main(String[] args) {
		Adder a=new Adder();
		System.out.println(a.add(1,2));
		System.out.println(a.add(1,2,3));
	
	}

}
