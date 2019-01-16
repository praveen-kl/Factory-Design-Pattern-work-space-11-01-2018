package com.design.factory;
import com.design.bank.Bank;
import com.design.loan.Loan;

public abstract class AbstractFactory {

	public	abstract Bank getBank(String Bank);
	
	public abstract Loan getLoan(String loan);

}
