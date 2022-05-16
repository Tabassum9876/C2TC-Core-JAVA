package com.tns.at;

import java.util.ArrayList;

 @FunctionalInterface     //This Functional interface contain only 1 method if u try to add another method it will give u error
interface ABC
{
	void show();
}
class A
{
	public void showMyDataFromLastyearDatabase() {
    System.out.println("In A");
		
	}
}

class B extends A
{   
	@Deprecated     	//This means don't use this method
	public void show()
	{
		
	}
	
	@Override
	@SuppressWarnings("Unchecked")	
public void showMyDataFromLastyearDatabase() 
	{
	ArrayList<Integer> obj=new ArrayList();
	System.out.println("In B");	
	}

}
public class AnnotationEx {

	public static void main(String[] args) {
		B obj=new B();
		obj.showMyDataFromLastyearDatabase();
		
	}

}
