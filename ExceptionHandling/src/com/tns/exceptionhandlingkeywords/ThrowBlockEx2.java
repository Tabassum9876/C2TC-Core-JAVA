package com.tns.exceptionhandlingkeywords;

public class ThrowBlockEx2 {
	public static void validate(int age) {

		if(age<21||age>27)
			throw new ArithmeticException("not eligible");
		else
			System.out.println("Eligicble to attend Military Selection");
		}


	public static void main(String[] args) {
		try
		{
			validate(21);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code...");
		
	}

}
