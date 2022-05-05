package com.tns.exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		fis=new FileInputStream("D:/myfile.txt");
		int k;
		while((k=fis.read() ) !=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}

}
