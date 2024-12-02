package com.bv.scanner;

import java.util.Scanner;

public class ScanneEx1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();

		if (username.equalsIgnoreCase("sathya") && password.equals("sathya123")) {
			System.out.println("login succes");
		} else
			System.out.println("login denied!!please enter valid credentials");
	}
}
