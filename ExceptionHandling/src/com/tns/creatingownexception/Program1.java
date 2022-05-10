package com.tns.creatingownexception;

import java.util.Scanner;

public class Program1 {
	static void splitString(String text) {
		try
		{
			String[] splittedString=text.split("/");
			for(int i=0;i<splittedString.length;i++)
			{
				System.out.println("Splitted String at index" + i +"is:" + splittedString[i]);
			}			
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		
		String text=sc.nextLine();
		if(text.length()>2)
		{
			splitString(text);
		}
		else
		{
			splitString(null);
		}
	}

}
