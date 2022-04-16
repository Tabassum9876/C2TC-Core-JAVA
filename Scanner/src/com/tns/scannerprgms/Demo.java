package com.tns.scannerprgms;

//program to read some numbers from console & print their output

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0,count=0,num=0,j=0;
		System.out.println("Enter a number");
		int n=sc.nextInt()
;
		while(j<n) {
			num=sc.nextInt();
			sum+=num;
			j++;
			}
		int mean = sum/n;
		System.out.println("Mean is:" + mean);
	}

}
