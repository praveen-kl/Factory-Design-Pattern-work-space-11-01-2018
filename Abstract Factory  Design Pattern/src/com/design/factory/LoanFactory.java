package com.design.factory;

import com.design.bank.Bank;
import com.design.loan.BussinessLoan;
import com.design.loan.EducationLoan;
import com.design.loan.HomeLoan;
import com.design.loan.Loan;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String Bank) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Loan getLoan(String loantype) {
		if(loantype==null) return null;
		
		if(loantype.equalsIgnoreCase("home"))
			return new HomeLoan();
		if(loantype.equalsIgnoreCase("business"))
			return new BussinessLoan();
		if(loantype.equalsIgnoreCase("education"))
			return new EducationLoan();
		
		
		return null;
		
}
}
