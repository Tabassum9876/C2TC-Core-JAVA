package com.tns.regex;

import java.util.regex.Pattern;

public class MetacharactersExample {

	public static void main(String[] args) {
		
	 System.out.println("Metacharacters d...");
	 System.out.println(Pattern.matches("\\d", "abc"));
	 System.out.println(Pattern.matches("\\d", "1"));
	 System.out.println(Pattern.matches("\\d", "4443"));
	 System.out.println(Pattern.matches("\\d", "323abc"));
		
	}

}
