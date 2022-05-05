package com.tns.MethodsinArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleMethod {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("C");
		list.add("Python");
		list.add(".Net");
		list.add("Compliler");
		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:"+list);
		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:");
		
	}

}
