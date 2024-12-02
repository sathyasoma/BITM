package com.strings;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class StringtoAlphaChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first String value");
		String fname = sc.next();
		System.out.println("enter second String value");
		String sname = sc.next();

		String result = fname + sname;

		int k = result.length();

		int i, j;
		char c;
		char arr[] = result.toCharArray();
		for (i = 0; i < k; i++) {
			for (j = (i + 1); j < k; j++) {
				if (arr[j] < arr[i]) {
					c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}

		System.out.println("sorted String is ");
		for (i = 0; i < k; i++)
			System.out.print(arr[i]);
	}
}
