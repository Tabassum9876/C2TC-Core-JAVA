package com.tns.Interface;

interface Mother
{
	void snoring();
}
interface Father
{
	void snoring();
}
class You implements Mother,Father
{

	@Override
	public void snoring() {
		System.out.println("I got the habit of snoring from my Parents..");	
	}
	
	
}
public class MultipleInheritanceex4 {

	public static void main(String[] args) {
		You y=new You();
		 y.snoring();
		
	}

}
