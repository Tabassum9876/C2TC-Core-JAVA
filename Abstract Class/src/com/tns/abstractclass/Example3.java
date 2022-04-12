package com.tns.abstractclass;

abstract class Bank{
	abstract int rateofInterest();
}
class SBI extends Bank{
	int rateofInterest() {
		return 7;
	}
}
class HDFC extends Bank{
	int rateofInterest() {
		return 8;
	}
}
public class Example3 {

	public static void main(String[] args) {
		SBI s=new SBI();
		HDFC h=new HDFC();
		h.rateofInterest();
		System.out.println("The rate of Interest in SBI is:" +s.rateofInterest());
		System.out.println("The rate of Interest in HDFC is:" +h.rateofInterest());
		
	}

}
