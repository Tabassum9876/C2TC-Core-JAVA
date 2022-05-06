package com.tns.setinterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetLetters {

	public static void main(String[] args) {
		SortedSet<String> sites=new TreeSet();
		sites.add("Engineer");
		sites.add("Technology");
		sites.add("Developer");
		sites.add("code");
		sites.add("practice");
		sites.add("technical");
		System.out.println(sites);
		SortedSet<String>beforepractice=sites.headSet("practice"); //strictly less
		SortedSet<String>aftertechnical=sites.tailSet("practice"); //strictly greater than or equalto
		System.out.println(beforepractice);
		System.out.println(aftertechnical);
		System.out.println(sites);
		
		
	}

}
