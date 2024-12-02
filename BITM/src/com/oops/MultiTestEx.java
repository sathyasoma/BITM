package com.oops;
//multiple inheritance

interface A {

	void sleep();
}

interface B {
	void sleep();
}

public class MultiTestEx implements A, B {

	public static void main(String[] args) {
		MultiTestEx t = new MultiTestEx();

		t.sleep();

	}

	@Override
	public void sleep() {
		System.out.println("i am sleeping left side cus i get benifits of dization");

	}
}
