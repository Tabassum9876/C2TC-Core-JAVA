package com.tns.strings;

public class Stringexample5 {

	public static void main(String[] args) {
		String str1="Hello";
	    String str2="Hello";
	    String s1=new String("Hello");
	    String s2=new String("Hello");
	    
	    System.out.println(str1==str2);
	    System.out.println(str1==s1);
	    System.out.println(str1==s2);
	    System.out.println(str1.equals(str2));
	    
	    System.out.println(s1.equals(s2));
	    System.out.println(str1.equals(s1));	    
	}

}
