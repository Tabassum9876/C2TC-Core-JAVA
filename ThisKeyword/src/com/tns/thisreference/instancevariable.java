package com.tns.thisreference;

class Student{
	int rollno;
	String name;
	float fee;
	
	public Student(int rollno, String name, float fee) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	void display()
	{
		System.out.println(rollno +" " +name+" "+fee);
	}
	
}
public class instancevariable {

	public static void main(String[] args) {
		Student s1=new Student(111,"Zaid",8000f);
		Student s2=new Student(112,"Ali",7000f);
		s1.display();
		s2.display();
		
	}

}
