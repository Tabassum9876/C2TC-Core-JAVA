package com.tns.whileloop;

public class BreakWhileLoop {

	public static void main(String[] args) {
	 int a=1;
	 while(a<=10) {
		 if(a==5) 
			 break;    //forceful termination
		 System.out.print("\n\tStatement:" +a);  
		 a++;
	 }
	 System.out.println("\n\tEnd of Program");
	}
}
