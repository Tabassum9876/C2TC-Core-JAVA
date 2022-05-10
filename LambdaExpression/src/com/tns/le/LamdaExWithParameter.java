package com.tns.le;

interface Drawable{
	public void draw(int width,int length);
}
public class LamdaExWithParameter {

	public static void main(String[] args) {
		Drawable d=(int width,int length)->{
			System.out.println("Draw a cube with width & length of "+width+" "+length);
		};
		d.draw(10,20);
		
	}

}
