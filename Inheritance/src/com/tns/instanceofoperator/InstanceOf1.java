package com.tns.instanceofoperator;

class A{
	void show() {
		System.out.println("In show A");
	}
}
class B extends A{
	void run()
	{
		
	}
}
public class InstanceOf1 {

	public static void main(String[] args) {
	B obj=new B();
	System.out.println(obj instanceof A);
	}

}
