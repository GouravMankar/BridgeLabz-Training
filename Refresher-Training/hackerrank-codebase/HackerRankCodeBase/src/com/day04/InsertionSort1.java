package com.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort1 {
	public static void insertionSort1(int n, List<Integer> arr) {

		int value = arr.get(n - 1);
		int i = n - 2;
		while (i >= 0 && arr.get(i) > value) {
			arr.set(i + 1, arr.get(i));

			for (Integer val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			i--;
		}
		arr.set(i + 1, value);
		for (Integer val : arr) {
			System.out.print(val + " ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		List<Integer> arr = new ArrayList<>();

		System.out.println("Enter array elements:");

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		insertionSort1(n, arr);

		sc.close();

	}

}
