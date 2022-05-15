package com.tns.sapi;

import java.util.Arrays;
import java.util.List;

public class Divisibilty {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(12,20,35,46,55,68,75);
		int result=0;
		for(int i: list) 
		{
			if(i%5==0) {
			result+=i*2;
		    }
		}
		System.out.println(result);
	
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->(c+e)));
	}

}

