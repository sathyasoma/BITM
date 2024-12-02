package com.strings;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How many numbers you want to store: ");

		int n = sc.nextInt();
		// array in the memory of length 15
		int[] array = new int[8];
		System.out.println("Enter the elements of the array you want: ");
		for (int i=0; i < n; i++) {

			array[i] = sc.nextInt();
		}
		System.out.println("Array elements are: ");
		// accessing array elements using the for loop
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
}
