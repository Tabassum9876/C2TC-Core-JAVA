package com.tns.wc;

public class Unboxing {

	public static void main(String[] args) {
		Integer a=new Integer(6);   
		int i=a.intValue();   //  Unboxing(old version)
		int j=a;           //Unboxing(new version)
		System.out.println(a + " "+i+ " "+j);
	}
	}

