package com.tns.le;

import java.util.ArrayList;

public class ForEachLoop1 {

	public static void main(String[] args) {
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Ayeza");
		obj.add("Khan");
		obj.add("Mahira");
		obj.add("Sajal");
		for(String a : obj) {
			System.out.println(a);
		}
		
	}

}
