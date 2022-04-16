package com.tns.Interface;

interface Inf
{
	public void method();
}
class Demo implements Inf
{
	public void method()
	{
		System.out.println("method");
	}
}

public class Example {

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.method();
		}
	}

