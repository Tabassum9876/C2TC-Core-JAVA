package com.tns.MethodsinArrayList;

import java.util.ArrayList;

public class IndexOfandLastIndexOfMethod {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Java");
		list.add("J2EE");
		list.add("JSP");
	    list.add("JavaScript");
	    list.add("Servlets");
	    list.add("Java");
	    list.add("Struts");
		System.out.println(list);
		System.out.println(list.indexOf("Java"));
		System.out.println(list.lastIndexOf("Java"));
	
	}

}
