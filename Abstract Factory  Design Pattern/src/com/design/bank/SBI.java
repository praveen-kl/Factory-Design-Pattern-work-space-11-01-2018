package com.design.bank;

public class SBI implements Bank {

	private String bankName;
	
	public SBI() {
	
		bankName="SBI";
	}
	@Override
	public String getBankName() {
	
		return bankName;
	}

}
