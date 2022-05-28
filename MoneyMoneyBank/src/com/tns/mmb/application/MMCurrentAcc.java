package com.tns.mmb.application;

import com.tns.mmb.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
		
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);	
	}

	public void withdraw(float creditLimit) {
		System.out.println("Dear Current Account User,Your Balance is: "+accBal+" with credit Limit of : "+creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + 
				",hashCode()="+ hashCode()+ "]";
	}
	

}