package com.tns.enumm;

public class EnumMethod {
	
   public enum Season{                     //defining Enum within the class
    	SUMMER,WINTER,SPRING,AUTUMN
    }

	public static void main(String[] args) {
		Season s=Season.SUMMER;
		System.out.println(s);
		System.out.println(Season.SPRING);
		System.out.println(Months.FEBRUARY);
		System.out.println(Months.JANUARY);
	}

}
