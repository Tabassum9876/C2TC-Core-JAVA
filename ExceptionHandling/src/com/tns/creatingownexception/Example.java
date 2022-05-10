package com.tns.creatingownexception;


class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		System.out.println(s);
	}
}
public class Example {
	static void validate(int age)throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("Invalid Input");
		else
			System.out.println("Right to Vote");
	}

	public static void main(String[] args) {
		try
		{
			validate(14);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);
		}
		System.out.println("rest of the code..");
	}

}

