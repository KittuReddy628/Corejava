package com.tnsif.exceptiondemo;

import java.nio.InvalidMarkException;

public class Division {
	public static void divide()  {
		int a=6,b=0,c;
		try {
			c=a/b;
			System.out.println("division"+c);
		}
		catch(InvalidMarkException e) {
			System.out.println("exception caught"+e.getMessage());
			}
		
		catch(ArithmeticException e) {
			System.out.println("exception caught"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("ecxception caught"+e.getMessage());
		}
	
	}

}
