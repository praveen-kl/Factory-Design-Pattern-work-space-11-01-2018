package com.design.bank;

public class UNIONBANK implements Bank {

	private String bankName;
	public UNIONBANK() {
	
	bankName="UNIONBANK";
	}
	
	@Override
	public String getBankName() {
    return	bankName;
	}

}
