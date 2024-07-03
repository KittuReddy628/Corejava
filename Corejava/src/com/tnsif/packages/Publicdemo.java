package com.tnsif.packages;

public class Publicdemo {
	public int a = 7; //if we make it private we can access it only in this class

	public static void main(String[] args) {
		Publicdemo demo = new Publicdemo();
		System.out.println(demo.a);
	}
}
