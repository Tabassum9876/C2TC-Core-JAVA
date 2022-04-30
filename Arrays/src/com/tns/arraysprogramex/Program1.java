package com.tns.arraysprogramex;

import java.util.Scanner;

//write a java code to search a given number in anarray.If the elements is found then print Found else print Not Found

public class Program1 {

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
		
		int is_matched=0;
		for(i=0;i<arr_size;i++)
		{
			if(arr[i]==search_elem)
			{
				is_matched=1;
				break;
			}
		}
		if(is_matched==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}
