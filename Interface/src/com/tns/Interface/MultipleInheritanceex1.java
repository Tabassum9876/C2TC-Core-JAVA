package com.tns.Interface;

interface interface1{
	public void myMethod();
}
interface interface2
{
	public void myMethod();
}
 class Main implements interface1,interface2
{
	public void myMethod()
	{
		System.out.println("Implementing more than one interfaces");
	}
}
public class MultipleInheritanceex1 {

	public static void main(String[] args) {
		Main obj=new Main();
		obj.myMethod();
		
	
	}

}
