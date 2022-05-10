package com.tns.methodsintreemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		SortedMap<String,String>t=new TreeMap<String,String>();
		t.put("Father","Advocate");
		t.put("Mother","Teacher");
		t.put("Son","Doctor");
		t.put("Daughter","Engineer");
		t.put("Cousin","Manager");
		for(SortedMap.Entry m:t.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());  
		}
		
	}

}
//Tree Map maintains ascending order,so the output comes in Alphabetical order.