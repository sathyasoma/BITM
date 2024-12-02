package com.oops;
//multilevel

class GrandParent{
	void hairBlack() {
		System.out.println("earliar days we have rich vitamins in food");
	}
	
}
class Parent2 extends GrandParent{
	
	void haircolor() {
		System.out.println("little bit white hair cuz of low vitamins");
	}
	
}

public class Child1Ex extends Parent2{

	void noHair() {
		System.out.println("no food no hair");
	}
	
	
	public static void main(String[] args) {
		
		
		Child1Ex obj= new Child1Ex();
		
		obj.noHair();
		obj.haircolor();
		obj.hairBlack();
		
		
		
	}
}
