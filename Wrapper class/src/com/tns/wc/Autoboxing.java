package com.tns.wc;

public class Autoboxing {

	public static void main(String[] args) {
		int a=50;                      //Primitive type
		Integer i=Integer.valueOf(a);  // Autoboxing(old version)

		Integer j=a;                   //Autoboxing (new version)
		System.out.println(a + " "+i+" "+j);
	}

}
