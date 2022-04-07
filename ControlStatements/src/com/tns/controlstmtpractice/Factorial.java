package com.tns.controlstmtpractice;

public class Factorial {

	public static void main(String[] args) {
      int number=5;
      int factorial=1;
      for(int i=2;i<number;i++)
      {
    	  factorial*=factorial;    
    	  }
 
      System.out.println("Factorialof 5:" +factorial);
	}

}
