package com.design.loan;

public abstract class Loan {

	protected double rate;
	
	public abstract void getInterstRate(double rate);
	//I have one concreate method which calculates loanPayment
	
	public void caluclateLoanPayment(double loanamount,int years){
		
		//Here i need to calculate monthly EMI
		
		double EMI;
		int n; //number of monthly installments
		
		n=years*12;  
        rate=rate/1200;  
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
 
System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed"); 
	}
	
}
