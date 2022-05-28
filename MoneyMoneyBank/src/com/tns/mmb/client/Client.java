package com.tns.mmb.client;

import com.tns.mmb.application.MMBankFactory;
import com.tns.mmb.application.MMCurrentAcc;
import com.tns.mmb.application.MMSavingAcc;
import com.tns.mmb.framework.BankFactory;
import com.tns.mmb.framework.CurrentAcc;
import com.tns.mmb.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		
		BankFactory bf=new MMBankFactory();
		SavingAcc  sa=new MMSavingAcc(6543, "huma", 8000.0f, true);
		sa.withdraw(sa.getaccBal());
		sa.toString();
		CurrentAcc ca=new MMCurrentAcc(3456, "seema", 4000.0f, 2000.0f);
		ca.withdraw(ca.getcreditLimit());
		ca.toString();
		
		
		}

}
