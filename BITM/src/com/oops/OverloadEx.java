package com.oops;

public class OverloadEx {

	public void addition(int a, int b, int c) {
		System.out.println("addition of three int params :" + (a + b + c));
	}

	public void addition(int a, int b) {
		System.out.println("addition of two int params :" + (a + b));
	}

	public void addition(float a, float b) {
		System.out.println("addition of two float params :" + (a + b));
	}

	public void addition(float a, int b) {
		System.out.println("addition of  float,int float params :" + (a + b));
	}

	public void addition(int a, float b) {
		System.out.println("addition of int, float params :" + (a + b));
	}

	public static void main(String[] args) {

		OverloadEx obj= new OverloadEx();
		
		obj.addition(78, 56); // 
		obj.addition(45.0f, 78);
		obj.addition('a', 'a'); //type promotion
		
	}
}
