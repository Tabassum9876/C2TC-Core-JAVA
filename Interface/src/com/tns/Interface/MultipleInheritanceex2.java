package com.tns.Interface;
 
interface Firstinterface
{
	public void myMethod();
}
interface Secondinterface
{
	public void myOtherMethod();
}
class DemoClass implements Firstinterface,Secondinterface
{
	public void myMethod()
	{
		System.out.println("Firstinterface");
	}
	public void myOtherMethod()
	{
		System.out.println("Secondinterface");
	}
		
}
public class MultipleInheritanceex2 {

	public static void main(String[] args) {
		DemoClass myobj=new DemoClass();
		myobj.myMethod();
		myobj.myOtherMethod();
		
	}

}
