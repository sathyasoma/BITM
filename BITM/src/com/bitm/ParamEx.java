package com.bitm;

public class ParamEx {

	int marks=56;
	
	public ParamEx() { //DEFAULT CONSTRUCTOR
		System.out.println("i am default constructor");
	}
	
	public ParamEx(int salary,String name) {
		System.out.println("i am param constructor");
	}
	public ParamEx(float salary,String name) {
		System.out.println("i am param constructor");
	}
	public static void main(String[] args) {
		
		ParamEx obj1= new ParamEx();
		ParamEx obj= new ParamEx(52,"kohili");
		
		
	}
}
