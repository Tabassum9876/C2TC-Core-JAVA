package com.tns.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeySetMethod {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("Name","Tabassum Banu");
		map.put("Occupation","Developer");
		map.put("Country","India");
		System.out.println(map.get("Name"));
		Iterator<String>keySetIterator=map.keySet().iterator();
		while(keySetIterator.hasNext())
		{
			String key=keySetIterator.next();
			System.out.println(key+" "+map.get(key));
		}
	}

}
