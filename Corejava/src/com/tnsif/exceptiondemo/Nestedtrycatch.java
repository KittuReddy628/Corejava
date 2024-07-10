package com.tnsif.exceptiondemo;

public class Nestedtrycatch {
	public static void check()
	{
		String str="TNS";
		int slength=str.length();
		System.out.println("string length"+slength);
		String anotherstring=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("index out of bounds"+ex.getMessage());
			}
			System.out.println("string length"+anotherstring.length());
		}
		catch(NullPointerException np) {
			System.out.println("exception is thrown"+np.getMessage());
		}
		
	}

}
