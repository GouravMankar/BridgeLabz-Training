package com.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualStacks {

	public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {

		int h1Sum = 0, h2Sum = 0, h3Sum = 0;
		int h1Pointer = 0, h2Pointer = 0, h3Pointer = 0;
		for (Integer i : h1) {
			h1Sum += i;
		}
		for (Integer i : h2) {
			h2Sum += i;
		}
		for (Integer i : h3) {
			h3Sum += i;
		}

		while (true) {
			if (h1Pointer == h1.size() || h2Pointer == h2.size() || h3Pointer == h3.size()) {
				return 0;
			}
			if (h1Sum == h2Sum && h1Sum == h3Sum) {
				return h1Sum;
			} else if (h1Sum >= h2Sum && h1Sum >= h3Sum) {
				h1Sum -= h1.get(h1Pointer);
				h1Pointer++;
			} else if (h2Sum >= h1Sum && h2Sum >= h3Sum) {
				h2Sum -= h2.get(h2Pointer);
				h2Pointer++;
			} else {
				h3Sum -= h3.get(h3Pointer);
				h3Pointer++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Number of cylinders in each stack
		System.out.print("Enter size of Stack 1: ");
		int n1 = sc.nextInt();

		System.out.print("Enter size of Stack 2: ");
		int n2 = sc.nextInt();

		System.out.print("Enter size of Stack 3: ");
		int n3 = sc.nextInt();

		List<Integer> h1 = new ArrayList<>();
		List<Integer> h2 = new ArrayList<>();
		List<Integer> h3 = new ArrayList<>();

		System.out.println("Enter elements of Stack 1:");
		for (int i = 0; i < n1; i++) {
			h1.add(sc.nextInt());
		}

		System.out.println("Enter elements of Stack 2:");
		for (int i = 0; i < n2; i++) {
			h2.add(sc.nextInt());
		}

		System.out.println("Enter elements of Stack 3:");
		for (int i = 0; i < n3; i++) {
			h3.add(sc.nextInt());
		}

		int answer = equalStacks(h1, h2, h3);

		System.out.println("Maximum Equal Height = " + answer);

		sc.close();

	}

}
