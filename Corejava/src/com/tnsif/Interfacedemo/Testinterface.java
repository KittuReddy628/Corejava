package com.tnsif.Interfacedemo;

public class Testinterface {
	public static void main(String[] args) {
		Bank b=new SBI();
		Bank b1=new FN();
		System.out.println("ROI"+b.rateofinterest());
		System.out.println("ROI"+b1.rateofinterest());
	}

}
