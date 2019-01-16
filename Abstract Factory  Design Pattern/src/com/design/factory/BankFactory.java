package com.design.factory;

import com.design.bank.Bank;
import com.design.bank.HDFC;
import com.design.bank.ICICI;
import com.design.bank.SBI;
import com.design.bank.UNIONBANK;
import com.design.loan.Loan;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String Bank) {
	
		if(Bank.equalsIgnoreCase("icici"))
			return new ICICI();
		
		if(Bank.equalsIgnoreCase("hdfc"))
			return new HDFC();
		
		if(Bank.equalsIgnoreCase("SBI"))
			return new SBI();
		
		if(Bank.equalsIgnoreCase("unionBank"))
			return new UNIONBANK();

		
		return null;
		
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}

}
