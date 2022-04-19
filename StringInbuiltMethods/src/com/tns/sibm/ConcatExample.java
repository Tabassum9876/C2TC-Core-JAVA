package com.tns.sibm;

public class ConcatExample {

	public static void main(String[] args) {
		String s1="Nice";
		String s2="Day";
		System.out.println(s1.concat(s2)); //it will print without space NiceDay
		System.out.println(s1+s2);         //it will print without space NiceDay

		System.out.println(s1+" " +s2);    //it will print with space Nice Day

	}
	}

