package com.tns.arraysprogramex;

import java.util.Scanner;

//java prgm to interchange elements of first & lasr row in 3*3 matrix

public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		int a[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
			}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]+" ");			
		}
			System.out.println();		
		}
		for(int i=0;i<a.length;i++)
		{
			int t=a[0][i];
			a[0][i]=a[2][i];
			a[2][i]=t;
		}
	System.out.println("Matrix after swapping");
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a.length;j++) {
			 System.out.println(a[i][j]+" ");
		 }
		 System.out.println();
				
	 }
	}
}
