package com.bv.scanner;

import java.util.Scanner;

//scanner is calss present in util pacakage
public class ScannerEx {

	public static void main(String[] args) {  //java.lang
			
		//java.util
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int x=sc.nextInt();
		System.out.println("Enter second Number");
		int y=sc.nextInt();
		
		int z=x+y;
		System.out.println("sum of numbers:"+z);
		sc.close();
		
		
	}
	
}
