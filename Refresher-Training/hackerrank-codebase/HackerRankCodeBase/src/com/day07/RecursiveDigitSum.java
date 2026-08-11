package com.day07;

import java.util.Scanner;

public class RecursiveDigitSum {


	static int superDigit(String n, int k) {
		long sum = 0;

		for (char c : n.toCharArray()) {
			sum += c - '0';
		}
		sum *= k;

		if (sum < 10) {
			return (int) sum;
		}

		return superDigit(String.valueOf(sum), 1);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next(); 
		int k = sc.nextInt(); 
		System.out.println(superDigit(n, k));
		sc.close();
	}
}
