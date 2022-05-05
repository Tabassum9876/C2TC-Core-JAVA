package com.tns.MethodsinArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillMethod {

	public static void main(String[] args) {
		List<String>arrlist=new ArrayList<>();
		arrlist.add("Java");
		arrlist.add("Technical");
		arrlist.add("Webinar");
		System.out.println("List elements before Replacements:"+arrlist);
		Collections.fill(arrlist,"technology");
		System.out.println("List elements after Replacements:"+arrlist);
		
	}

}
