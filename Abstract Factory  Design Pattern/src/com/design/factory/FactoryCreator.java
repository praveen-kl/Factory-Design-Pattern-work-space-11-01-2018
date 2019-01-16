package com.design.factory;

public class FactoryCreator {

	public	static AbstractFactory getFactoryType(String choice){
		
		if(choice.equalsIgnoreCase("Bank")){
			return new BankFactory();
		}
		else if (choice.equalsIgnoreCase("loan")) {
			return new LoanFactory();
		}
		return null;
	}
}
