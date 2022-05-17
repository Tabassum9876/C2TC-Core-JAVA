package com.tns.enumm;

public class EnuminSwitchStmt {
	enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY}

	public static void main(String[] args) {
		Day day=Day.FRIDAY;
		
		switch(day)
		{
		case SUNDAY:
		  System.out.println("Moving towards Monday");
		  break;
		case FRIDAY:
		  System.out.println("Hurrah! It's a Weekend");
		  break;
		default:
			System.out.println("Other day");
			
		}
		
		
	}

}
