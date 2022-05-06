package com.tns.setinterface;

import java.util.ArrayList;
import java.util.List;
                              //List Prints d output in Ordered collection & duplicates values are stored
public class ListEx {

	public static void main(String[] args) {
		
		List obj= new ArrayList();
		obj.add("Object");
		obj.add("Method");
		obj.add("Method");
		obj.add(10.0);
		obj.add(100);
		System.out.println(obj);
	}

}
