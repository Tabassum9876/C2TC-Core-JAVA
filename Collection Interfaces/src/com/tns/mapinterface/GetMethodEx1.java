package com.tns.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class GetMethodEx1 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("Name","Tabassum");
		map.put("Occupation","Engineer");
		map.put("Country","India");
		System.out.println(map.get("Salary"));
	
	}

}
