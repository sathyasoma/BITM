package com.oops;

class Parents{
	
	void marrige() {
		System.out.println("arrange marrige");
	}
	
	void property() {
		System.out.println("1000 crore property");
	}
}
public class OverRidingEx extends Parents { //child

	public static void main(String[] args) {
		
		
		OverRidingEx obj= new OverRidingEx();
		obj.marrige();
		obj.property();
	}
	
	@Override
	void marrige() {
		System.out.println("love marrige");
	}
}
