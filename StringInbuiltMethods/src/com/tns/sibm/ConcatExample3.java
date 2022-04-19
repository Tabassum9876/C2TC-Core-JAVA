package com.tns.sibm;

public class ConcatExample3 {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Have a";
		String s2="Nice";
		String s3="Day";
		System.out.println(s+ " "+ s1+" "+s2+" "+s3);
		System.out.println(s.concat(s1).concat(s2).concat(s3));
	}
	

}
