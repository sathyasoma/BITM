package com.oops;

abstract class Test {

	void display() { // implemented method
		System.out.println("i am display method");
	}

	abstract void button(); // unimplemented method
}

public class AbstracTeX extends Test {

	public static void main(String[] args) {

		AbstracTeX obj = new AbstracTeX();

		obj.display();
		obj.button();

	}

	@Override
	void button() {
		System.out.println(" igot it i will send infio to server");

	}
}
