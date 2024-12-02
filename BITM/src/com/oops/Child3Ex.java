package com.oops;
//hirarchial inheritance

class Parent3{
	void delhi() {
		System.out.println("out of town");
	}
}

class child4 extends Parent3{
	void birdthday() {
		System.out.println("in kochi celebrating birthday");
	}
}
public class Child3Ex extends Parent3{

	void furtherStudies() {
		System.out.println("goig to hier studies");
	}
	public static void main(String[] args) {
		
		Child3Ex ch= new Child3Ex();
		
		//child4 ch= new child4();
		//ch.birdthday();
		ch.delhi();
		ch.furtherStudies();
	}
}
