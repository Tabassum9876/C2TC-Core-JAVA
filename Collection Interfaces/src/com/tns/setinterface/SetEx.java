package com.tns.setinterface;

import java.util.HashSet;
import java.util.Set;
                            //Set Interface Prints d output in Unordered collection & duplicates values are not stored
public class SetEx {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("Object");
		s.add("Method");
		s.add("Method");                 
		s.add(10.0);
		s.add(100);
		System.out.println(s);
		
	}

}
