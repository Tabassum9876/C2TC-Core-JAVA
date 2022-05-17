package com.tns.enumm;

public class EnumConstant1 {
	
	public enum Season{
		SUMMER(20),WINTER(45),SPRING(35),AUTUMN(80);
		int value;
		Season(int i)
		{
			value=i;
		}

	}
	public static void main(String[] args) {
		
		for(Season s:Season.values()) {
			System.out.println(s+" "+s.value);
		}
		for(Months m:Months.values()) {
			System.out.println(m);
		}
		
		
	}

}
