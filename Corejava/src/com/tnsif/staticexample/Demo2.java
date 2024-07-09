package com.tnsif.staticexample;

public class Demo2 {
	public static void main(String[] args) {
		Student.change();
		Student s=new Student(1,"shashi");
		Student s1=new Student(2,"kittu");
		s.display();
		s1.display();
	}

}
