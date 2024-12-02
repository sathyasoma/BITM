package com.exceptions;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int fnum= sc.nextInt();
		System.out.println("Enter 2nd number");
		int snum= sc.nextInt();
		
		try {
		int result=fnum/snum;
		System.out.println("result is :"+result);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("aRRAY INDEX EXCEPTION");
		}
		catch(NullPointerException AE) {
			System.out.println("null pointer Exception");
		}
		catch(ArithmeticException ae){
			System.out.println("dont enter denominator as zero");
		}
		finally {
			System.out.println("always executing closing the connection");
		}
		System.out.println("remaining 1000 lines of code");
	}
}
