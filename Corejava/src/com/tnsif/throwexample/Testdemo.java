package com.tnsif.throwexample;

import java.util.Scanner;

public class Testdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the roll no");
		int rollno=sc.nextInt();
		if(rollno<0)
			throw new ArithmeticException("roll no cannot be less than zero");
		else
			System.out.println("valid rollno");
	}

}
