package com.tns.abstractclass;

abstract class shape{
	abstract void draw();
}
class rectangle extends shape{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class circle extends shape{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
public class Example2 {

	public static void main(String[] args) {
		shape s= new rectangle();
		s.draw();
		shape c=new circle();
		c.draw();
		
		
	}

}
