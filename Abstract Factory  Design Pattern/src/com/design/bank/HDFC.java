package com.design.bank;

public class HDFC implements Bank {

private final String bankName;

	public HDFC() {
		bankName="HDFC";
	}
	@Override
	public String getBankName() {
		
		return bankName;
	}
	
	
}
