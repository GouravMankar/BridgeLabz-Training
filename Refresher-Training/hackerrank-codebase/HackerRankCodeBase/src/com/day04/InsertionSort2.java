package com.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort2 {
	public static void insertionSort2(int n, List<Integer> arr) {

		for (int i = 1; i < n; i++) {

			int key = arr.get(i);
			int j = i - 1;

			while (j >= 0 && arr.get(j) > key) {

				arr.set(j + 1, arr.get(j));
				j--;
			}

			arr.set(j + 1, key);

			// Print array after each pass
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
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

		insertionSort2(n, arr);

		sc.close();

	}

}
