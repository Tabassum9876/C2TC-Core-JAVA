package com.tns.arraysprogramex;

//write a program to find out total marks obtained by a student if the student gets 3 marks for the correct answer
  // and -1 for he wrong

public class Program5 {

	public static void main(String[] args) {
		int arr[]= {1,0,1,1,1,0,0};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
				sum=sum+3;
			else
				sum=sum-1;
		}
		System.out.println("Total Marks Obtained:"+sum);
		
	}

}
