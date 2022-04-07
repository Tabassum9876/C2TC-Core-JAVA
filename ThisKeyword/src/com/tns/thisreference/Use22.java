package com.tns.thisreference;

class Demo2
{
	Demo2()
	{
		this(6);
		System.out.println("Hello friends");
	}
	Demo2(int x)
	{
		this(8,9);
		System.out.println(x);
	}
   Demo2(int x, int y){
	   System.out.println(x +" "+ y);
   }
	}

public class Use22 {

	public static void main(String[] args) {
		Demo2 d=new Demo2();

	}

}
