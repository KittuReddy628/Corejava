package com.tnsif.Constructor;

public class Conexample {
	Conexample(){
		System.out.println("default cons");
	}
	Conexample(int i){
		System.out.println("welcome");
	}
	Conexample(int i,int j){
		System.out.println("consexample");
	}
public static void main(String[] args) {
	Conexample c = new Conexample();
	Conexample c1 = new Conexample(2);
	Conexample c2 = new Conexample(2,3);
	
}
}
