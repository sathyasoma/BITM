package com.oops;
//singlelevel

class Parent {
	int marks = 89;

	void camera() {
		System.out.println("i am camera method from parent");
	}

}

public class ChildEx extends Parent {

	void keypad() {
		System.out.println("i am keypad method from child");
	}

	public static void main(String[] args) {

		ChildEx obj = new ChildEx();

		obj.keypad();
		obj.camera();
		System.out.println(obj.marks);

	}
}
