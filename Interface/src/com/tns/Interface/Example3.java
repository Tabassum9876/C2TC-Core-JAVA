package com.tns.Interface;
interface Bank{
	float rateofInterest();
}
class SBI implements Bank{
	public float rateofInterest()
	{
		return 9.15f;
	}
}
class HDFC implements Bank{
	public float rateofInterest()
	{
		return 9.7f;
	}
}
public class Example3 {

	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println("ROI: "+ b.rateofInterest());
	}

}
