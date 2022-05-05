package com.tns.MethodsinArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrderMethod {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(80);
		l.add(05);
		l.add(32);
		l.add(2);
		System.out.println("Original List:"+l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse List:"+l);
		
	}

}
