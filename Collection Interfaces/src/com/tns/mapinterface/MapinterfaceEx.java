package com.tns.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapinterfaceEx {

	public static void main(String[] args) {
		Map<Character,String> map=new HashMap<Character,String>();
		map.put('a',"Aryan");
		map.put('b',"Bahubali");
		map.put('c',"Charan");
		map.put('d',"Dhoni");
	    map.put('d',"Dhoni");      //In Map duplicate keys are not allowed,In this example Key 'd' gets repeated.
	    System.out.println(map);     // It chooses the last one which assigns
		
	
	}

}
