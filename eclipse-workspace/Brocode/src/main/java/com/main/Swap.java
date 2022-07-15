package com.main;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A number: ");
		int a = scan.nextInt();
		System.out.println("Enter B number: ");
		int b = scan.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		scan.close();
		System.out.println(a + "," + b);

	}

}
