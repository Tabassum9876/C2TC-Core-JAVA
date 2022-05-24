package com.tns.mmb.application;

import com.tns.mmb.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	public void withdraw(float accBal) {
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc []";
	}
	

}
