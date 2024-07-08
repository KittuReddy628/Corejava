package com.tnsif.inheritance;

public class Child extends Father{
String cycle="pink";
String car="benz";
public void display() {
	System.out.println(super.car);
}
public static void main(String[] args) {
	Child c =new Child();
	c.drinking();
	System.out.println(c.car);
	System.out.println(c.cycle);
	System.out.println(c.money);
	c.display();
}
}

