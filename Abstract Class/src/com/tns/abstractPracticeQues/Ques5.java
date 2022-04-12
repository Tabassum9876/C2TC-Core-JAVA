package com.tns.abstractPracticeQues;

abstract class dress
{
	abstract void type();	
}
class menswear extends dress
{
	void type()
	{
		System.out.println("Its a Menswear");
	}
}
public class Ques5 {

	public static void main(String[] args) {
		menswear coat= new menswear();
		 coat.type();
		
	}

}
