package com.tns.mmb.application;

import com.tns.mmb.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float MINBAL=500 ;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	public void withdraw(float accBal) {
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc []";
	}
	

}
