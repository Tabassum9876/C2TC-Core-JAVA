package com.tns.le;

interface Drawable2{
	public void draw(int radius);
}

public class LamdaExWithParameter2 {

	public static void main(String[] args) {
		Drawable2 d=(int radius)->{
			System.out.println("Draw a circle with radius of "+radius);
		};
		d.draw(10);
		
		
	}

}
