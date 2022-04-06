package com.tns.statickeyword;

class Student2{
	int rollno;
	String name;
	static String College;
	static { 
		College = "KBNCE";
	}
	
	 Student2(int r, String n) {
		rollno = r;
		name = n;
	}
	
	static void change() {
		College = "PDA";
	}
	void Display() {
		System.out.println(rollno + " "+ name + " " +College);
	}	
}


public class Block {

	public static void main(String[] args) {
		
		Student s1 =new Student(101, "Atif");
    	Student s2 =new Student(102, "Zain");
		Student1.change();
		s1.Display();
		s2.Display();
	
	}

}
