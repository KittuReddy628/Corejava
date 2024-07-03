package com.tnsif.Scannerclass;

import java.util.Scanner;

public class Personexe {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name");
	String name= sc.nextLine();
	System.out.println("enter the income");
	int income=sc.nextInt();
	Person pp =new Person();
	pp.setName(name);
	pp.setIncome(income);
	Taxcalculation t = new Taxcalculation();
	t.Calculationtax(pp);
	System.out.println("after modification");
	System.out.println(pp);
}
}
