package com.strings;

import java.util.Scanner;

public class TestEx {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter 1st number");
	int fnum=sc.nextInt();
	System.out.println("Enter 2nd number");
	int snum=sc.nextInt();
	
	try {
	int result= fnum/snum;
	System.out.println("result is:"+result);
	}
	catch(ArithmeticException ar) {
		System.out.println("dont enter denominator as zero");
	}
	finally{
		System.out.println("it is always exeuted");
		
	}
	System.out.println("remaining 1000 lines of code");
}
}
