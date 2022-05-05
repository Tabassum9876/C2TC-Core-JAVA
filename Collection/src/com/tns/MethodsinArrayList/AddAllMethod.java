package com.tns.MethodsinArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddAllMethod {

	public static void main(String[] args) {
		List<String> val1=new ArrayList<>();
		val1.add("Corona can be stopped");
		List<String> val2=new ArrayList<>();
		val1.add("Stay at home");
		val1.addAll(val2);
		System.out.println(val1);
	
	}

}
