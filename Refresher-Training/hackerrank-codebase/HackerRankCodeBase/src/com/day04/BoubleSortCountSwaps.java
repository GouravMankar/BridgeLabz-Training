package com.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoubleSortCountSwaps {
	public static void countSwaps(List<Integer> a) {

		int n = a.size();
		int swap = 0;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (a.get(j) > a.get(j + 1)) {

					int temp = a.get(j);
					a.set(j, a.get(j + 1));
					a.set(j + 1, temp);

					swap++;
				}
			}
		}

		System.out.println("Array is sorted in " + swap + " swaps.");
		System.out.println("First Element: " + a.get(0));
		System.out.println("Last Element: " + a.get(n - 1));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		countSwaps(a);

		sc.close();
	}
}
