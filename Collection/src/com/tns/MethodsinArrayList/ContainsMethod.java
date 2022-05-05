package com.tns.MethodsinArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContainsMethod {

	public static void main(String[] args) {
		List<String>var=new ArrayList<String>();
		var.add("Pen");
		var.add("Pencil");
		var.add("Eraser");
		System.out.println("List"+var);
		boolean res=var.contains("Pencil");
		System.out.println("Is pencil present in the list:"+res);
	
	}

}
