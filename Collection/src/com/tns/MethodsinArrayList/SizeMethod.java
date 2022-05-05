package com.tns.MethodsinArrayList;

import java.util.ArrayList;

public class SizeMethod {

	public static void main(String[] args) {
		ArrayList<Integer>arrlist=new ArrayList<Integer>();
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(22);
		arrlist.add(25);
		int value=arrlist.size();
		System.out.println(value);

	}

}
