package com.tns.sapi;

import java.util.Arrays;
import java.util.List;

public class DistinctMethod {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,4,3,7);
		list.stream().distinct().forEach(System.out::println);
		
	}

}
