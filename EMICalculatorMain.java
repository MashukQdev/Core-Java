package com.main;

/**
 Simple program to calculate EMI using class, object, variables, operators and datatype
 Practical 8 from core java practicals
 @author Mashuk patel 
 */
class CalculateEMI {
	
	private double principalamount;
	private double yearlyrate;
	private int yearlytenure;
	
	public CalculateEMI(double principalamount, double yearlyrate, int yearlytenure) {
		this.principalamount = principalamount;
		this.yearlyrate = yearlyrate;
		this.yearlytenure = yearlytenure;
	}
	
	/**
	 calculate monthlyrate from yearlyrate
	 calculate monthlytenure from yearly tenure 
	 calculate emi using formula [P * R * (1 + R) ^ N] / [((1 + R) ^ N) - 1]
	 where, P = principalamount
	        R = monthly rate
	        N = monthly tenure
	 @return emi
	 */
	public double calculateEMIMethod() {
		double monthlyrate = yearlyrate / (12 * 100);
		int monthlytenure = yearlytenure * 12;
		double emi = (principalamount * monthlyrate * Math.pow(1 + monthlyrate, monthlytenure)) / (Math.pow(1 + monthlyrate, monthlytenure) - 1);
		return emi;
	}
	
}

public class EMICalculatorMain {

	public static void main(String[] args) {
		CalculateEMI emi=new CalculateEMI(100000, 10, 5);
		System.out.println(emi.calculateEMIMethod());
	}
	
}
