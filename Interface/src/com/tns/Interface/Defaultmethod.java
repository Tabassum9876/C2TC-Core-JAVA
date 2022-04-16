package com.tns.Interface;

interface Sayable{
	default void say() {
		System.out.println("Hello, this is default method");
	}
	void saymore(String msg);
	
}
class DefaultMethods implements Sayable
{
	public void saymore(String msg)
	{
		System.out.println(msg);
	}
	
}
public class Defaultmethod {

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say();
		dm.saymore("Work is workship");
	
	}

}
