package com.tnsif.Constructor;

import java.util.Scanner;

public class Customerdemo {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter ur name");
		String name=sc.nextLine();
		
		System.out.println("enter ur cid");
		int id=sc.nextInt();
		System.out.println("enter ur address");
		String address=sc.nextLine();
		Customer c =new Customer();
		c.setCid(id);
		c.setCaddress(address);
		c.setCname(name);
		System.out.println(c);
		boolean out= c instanceof Customer;
		System.out.println(out);
		
	}

}
