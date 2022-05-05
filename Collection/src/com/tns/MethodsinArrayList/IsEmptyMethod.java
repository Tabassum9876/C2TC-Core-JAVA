package com.tns.MethodsinArrayList;

import java.util.ArrayList;

public class IsEmptyMethod {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Bottle");
		al.add("Water");
		al.add("Liquid");
		al.add("Oil");
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.contains("oil"));
		al.add(2,"salt");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("Oil"));
		System.out.println(al.size());
		
		
	}

}
