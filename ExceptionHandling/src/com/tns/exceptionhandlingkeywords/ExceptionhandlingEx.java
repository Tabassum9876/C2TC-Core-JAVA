package com.tns.exceptionhandlingkeywords;

import java.io.FileInputStream;

public class ExceptionhandlingEx {
	public void checkFileNotFound()
	{
		try
		{
			FileInputStream in=new FileInputStream("input.txt");
			System.out.println("This is not printed");
		}
		catch(Exception fileNotFoundException)
		{
			System.out.println(fileNotFoundException+"file not found exception");
		}
	}

	public static void main(String[] args) {
		ExceptionhandlingEx example=new ExceptionhandlingEx();
		example.checkFileNotFound();
	}

}
