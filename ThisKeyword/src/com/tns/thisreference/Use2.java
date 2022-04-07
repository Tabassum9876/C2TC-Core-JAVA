package com.tns.thisreference;

class Demo1
{
	Demo1()
	{
		System.out.println("Hello friends");
	}
	Demo1(int x)
	{
		this();
		System.out.println(x);
	}
}
public class Use2 {

	public static void main(String[] args) {
		Demo1 d=new Demo1(10);
	}

}
