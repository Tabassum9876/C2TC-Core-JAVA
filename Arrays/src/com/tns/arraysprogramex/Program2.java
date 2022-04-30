package com.tns.arraysprogramex;

import java.util.Scanner;

//write java code to find the number of occurrences of a given number in an array

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arr_size");
		
		int arr_size=sc.nextInt();
		int arr[]=new int[arr_size];
		int i;
		for(i=0;i<arr_size;i++)
		{
			System.out.println("Enter arr[]");
			arr[i]=sc.nextInt();
		}
		System.out.println( "Enter search_elem");
		
		int search_elem=sc.nextInt();
		int count=0;
		for(i=0;i<arr_size;i++)
		{
			if(arr[i]==search_elem)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
