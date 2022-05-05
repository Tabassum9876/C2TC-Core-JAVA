package com.tns.MethodsinArrayList;

import java.util.ArrayList;
import java.util.List;

public class ClearMethod {

	public static void main(String[] args) {
		List<String> val=new ArrayList<>();
		val.add("JAVA");
		val.add("is");
		val.add("Interesting");
		System.out.println("Before clear:"+val);
		val.clear();
		System.out.println("After clear:"+val);
		
	}

}
