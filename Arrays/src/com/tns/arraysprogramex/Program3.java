package com.tns.arraysprogramex;

import java.util.Scanner;

//write java code to find the largest number  in an array

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arr_size");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter arr[]");
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<a;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				}
		}
	      System.out.println(max);
	
	}

}
