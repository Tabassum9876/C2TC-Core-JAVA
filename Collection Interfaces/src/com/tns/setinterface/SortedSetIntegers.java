package com.tns.setinterface;

import java.util.SortedSet;
import java.util.TreeSet;
                              //SortedSet prints d output in Ascending order & duplicate values are not stored
public class SortedSetIntegers {

	public static void main(String[] args) {
		SortedSet ss=new TreeSet();
		ss.add(45);
		ss.add(1);
		ss.add(34);
		ss.add(34);
		ss.add(27);
		ss.add(45);
		System.out.println(ss);
		
	}

}
