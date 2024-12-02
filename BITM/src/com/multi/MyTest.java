package com.multi;

public class MyTest extends Thread{

	public void run() {
		//child thread area
		System.out.println("child thread name :"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		//main method area
		MyTest mt= new MyTest();
		MyTest mt1= new MyTest();
		mt.start(); 
		mt1.start();
		mt.setPriority(8);
		mt1.setName("ballaladeva");
		System.out.println("main thread name:"+Thread.currentThread().getName()); //main
		Thread.currentThread().setName("devasena");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getPriority());
		
		
	}
}
