package com.tns.regex;

import java.util.regex.Pattern;

public class QuantifiersExample {

	public static void main(String[] args) {
		System.out.println("? Quantifiers...........");
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?","aaaa"));
		System.out.println(Pattern.matches("[amn]?","aammmnn"));
		System.out.println(Pattern.matches("[amn]?","aazztta"));
		System.out.println(Pattern.matches("[amn]?","am"));

	}

}
