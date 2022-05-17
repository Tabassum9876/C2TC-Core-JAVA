package com.tns.enumm;

public class EnumMethod1 {
	
	 public enum Season{                           //defining Enum within the class
	    	SUMMER,WINTER,SPRING,AUTUMN;
	    }

	public static void main(String[] args) {
		for(Season s:Season.values()) {
			System.out.println(s);
		}
	   for(Months m:Months.values()) {
		   System.out.println(m);
	   }
	}

}
