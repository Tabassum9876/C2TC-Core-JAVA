package com.tns.setinterface;

import java.util.LinkedHashSet;
                                 //LinkedHashSet prints d output in Ordered Collection & does not store d duplicate values
public class LinkedHashSetEx {
                                 
	public static void main(String[] args) {
		LinkedHashSet<String> linkedset=new LinkedHashSet<String>();
		linkedset.add("Create");
		linkedset.add("Your");
		linkedset.add("Own");
		linkedset.add("Program");
		linkedset.add("Program");
		System.out.println(linkedset);
		
		
		
	}

}
