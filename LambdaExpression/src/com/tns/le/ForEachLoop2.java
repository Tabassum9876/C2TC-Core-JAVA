package com.tns.le;

import java.util.ArrayList;

public class ForEachLoop2 {

	public static void main(String[] args) {
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Ayeza");
		obj.add("Khan");
		obj.add("Mahira");
		obj.add("Sajal");
		obj.forEach(temp->System.out.println(temp));
	
	}

}
