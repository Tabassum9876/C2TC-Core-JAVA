package com.tns.mmb.application;

import com.tns.mmb.framework.BankFactory;
import com.tns.mmb.framework.CurrentAcc;
import com.tns.mmb.framework.SavingAcc;

public class MMBankFactory extends BankFactory{
	
	public SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean isSalary) {
		MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, accBal, isSalary);
		return mmsaving;
	
	}
	public CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, creditLimit,creditLimit );
		return mmcurrent;
	}

	

}
