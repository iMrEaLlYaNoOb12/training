package com.main;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		for (int i = n; i > n / 2; i--) {
			// if(i==5) {
			// continue;
			// }
			System.out.println(i);
		}
		scanner.close();
	}

}
