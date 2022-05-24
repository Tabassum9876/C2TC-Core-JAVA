package com.tns.mmb.application;

import com.tns.mmb.framework.BankFactory;
import com.tns.mmb.framework.CurrentAcc;
import com.tns.mmb.framework.SavingAcc;

public abstract class MMBankFactory extends BankFactory{
	
	public SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean isSalary) {
		return null;
	}
	public CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit) {
		return null;
	}

	

}
