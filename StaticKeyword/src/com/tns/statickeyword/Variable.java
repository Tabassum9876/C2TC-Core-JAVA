package com.tns.statickeyword;

class Student{
	int rollno;
	String name;
	static String College = "KBNCE";
	
	public Student(int r, String n) {
		rollno = r;
		name = n;
	}
	void Display() {
		System.out.println(rollno + " "+ name + " " +College);
	}	
}

public class Variable {

	public static void main(String[] args) {
		Student s1 =new Student(101, "Atif");
		Student s2 =new Student(102, "Zain");
		s1.Display();
		s2.Display();
	}

}
