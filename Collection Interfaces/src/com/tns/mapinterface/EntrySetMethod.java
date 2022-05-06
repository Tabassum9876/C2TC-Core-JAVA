package com.tns.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMethod {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(95,"Tabassum");
		map.put(80,"Aryan");
		map.put(96,"Saad");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
