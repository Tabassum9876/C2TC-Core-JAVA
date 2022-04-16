package com.tns.Interface;

interface Writeable
{
	void writes();
}
interface Readable 
{
	void reads();
}
 class Student implements Readable,Writeable
{
	public void reads()
	{
		System.out.println("Students Reads...");
	}
	public void writes()
	{
		System.out.println("Students writes...");
	}
	
}
public class MultipleInheritanceex3 {

	public static void main(String[] args) {
		Student s=new Student();
		s.reads();
		s.writes();
		
	}

}
