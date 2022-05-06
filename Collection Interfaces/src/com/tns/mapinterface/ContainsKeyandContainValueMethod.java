package com.tns.mapinterface;

import java.util.HashMap;

public class ContainsKeyandContainValueMethod {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		hash_map.put(1,"Laptop");
		hash_map.put(2,"Computer");
		hash_map.put(3,"Smartphone");
		hash_map.put(4,"Headphone");
		hash_map.put(5,"Charger");
		System.out.println(hash_map.containsKey(2));
		System.out.println(hash_map.containsKey(45));
		System.out.println(hash_map.containsValue("Computer"));
		System.out.println(hash_map.containsValue("Table"));
		
		
	}

}
