package com.tns.creatingownexception;

import java.util.Scanner;

class NamenotFoundException extends Exception{
	NamenotFoundException(String message)
	{
		System.out.print(message);
	}
}
public class CheckedCustomException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		
		String name=sc.nextLine();
		try
		{
			customername(name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void customername(String name)throws NamenotFoundException{
		if(name.isEmpty()) {
			throw new NamenotFoundException("Name id Empty");
		}
		else {
			System.out.println("Hi" +name + "Welcome to our store");
		}
	}

}
