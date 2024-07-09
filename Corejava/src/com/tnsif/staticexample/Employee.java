package com.tnsif.staticexample;

public class Employee {
	int eid;
	String ename;
	static String company="TNSIF";
	
	
	Employee(int r, String n){
		eid=r;
		ename=n;
	}
void display() {
	System.out.println(eid+"  "+ename+"  "+company);
}
}
