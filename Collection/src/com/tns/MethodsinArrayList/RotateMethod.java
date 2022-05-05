package com.tns.MethodsinArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateMethod {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		list.add("Practice");
		list.add("code");
		list.add("every");
		list.add("day");
		System.out.println("Original List:"+list);
		Collections.rotate(list,2);
		System.out.println("Original List:"+list);
		
	}

}
