package com.oops;

interface Interf {

	public abstract void iphone();// unimplemented methods or

	void eating();

	void wheel();

}
public class TestEx implements Interf {

	public static void main(String[] args) {
	//Interf obj= new Interf();   //we canot crete object of interface : compile time error
		
	TestEx t = new TestEx();

		t.eating();
		t.iphone();
		t.wheel();

	}

	@Override
	public void iphone() {
		System.out.println("nowdays iphone is common ");

	}

	@Override
	public void eating() {
		System.out.println("eating differently");

	}

	@Override
	public void wheel() {
		System.out.println("wheel is rotating ryt direction");

	}
}
