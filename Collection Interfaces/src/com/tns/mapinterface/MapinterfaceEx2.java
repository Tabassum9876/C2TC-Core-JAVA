package com.tns.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapinterfaceEx2 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"One");
		map.put(2,"Null");
		map.put(3,"three");
		map.put(4,"four");
		map.put(null,"five");
		map.put(null,"six");
		map.put(7,"null");
		System.out.println(map);
	    
		
	}

}
