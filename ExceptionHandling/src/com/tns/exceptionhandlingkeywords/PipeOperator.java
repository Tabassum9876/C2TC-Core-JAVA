package com.tns.exceptionhandlingkeywords;

public class PipeOperator {

	public static void main(String[] args) {
		String[] s= {"abc","123",null,"xyz"};
		for(int i=0;i<5;i++)
		{
			try
			{
				int a=s[i].length()+Integer.parseInt(s[i]);
		     }
		catch(NumberFormatException|NullPointerException|ArrayIndexOutOfBoundsException ex)
			{
			System.out.println("Handle above mentioned three Exception");
			}
	      }

}
}
