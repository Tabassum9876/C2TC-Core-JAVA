package com.tns.polymorphism;

class Student{
	int id;
	String name;
	int age;
	
	Student()
	{
		System.out.println("I am a Student");
		
	}
	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println(id+" "+name+" "+age);
	}
	Student(int id,String name,float Cgpa){
		System.out.println(id+" "+name+" "+Cgpa);
	}
}
public class ConstructorOverLoading {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(111,"Aryan",21);
		Student s3=new Student(111,"Aryan",6.5f);
		
		
	}

}
