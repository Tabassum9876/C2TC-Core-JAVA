package com.tns.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class PutAllMethod {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		hash_map.put(1,"Eat");
		hash_map.put(2,"Mobile");
		hash_map.put(3,"Sleep");
		hash_map.put(4,"Repeat");
		System.out.println("Initial Map:"+hash_map);
		HashMap<Integer,String> new_map=new HashMap<Integer,String>();
		new_map.putAll(hash_map);
		System.out.println(new_map);
		
	}

}
