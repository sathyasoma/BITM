package com.multi;
//by implmenting Runnable Interface
public class MyThread extends Thread  {
	
	public void run() {  //child thread
		
		for (int i = 0; i <5; i++) {
			System.out.println("seetha Thread");
		}
	}
public static void main(String[] args) {
	                                   //main method function executed by main thread
	MyThread mt= new MyThread();
//Thread t= new Thread(mt);  //if you want call start method we need to create Thread class Object
	mt.start();  //executing child thread
	
	for (int i = 0; i <5; i++) {
		System.out.println("Rama Thread");
	}
	
}
}
