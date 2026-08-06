package com.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSortOnePartition {
	public static List<Integer> quickSort(List<Integer> arr) {

		int pivot = arr.get(0);
		List<Integer> left = new ArrayList<>();
		List<Integer> equal = new ArrayList<>();
		List<Integer> right = new ArrayList<>();

		for (int num : arr) {
			if (num < pivot) {
				left.add(num);
			} else if (num > pivot) {
				right.add(num);
			} else {
				equal.add(num);
			}
		}
		List<Integer> finalArr = new ArrayList<>();
		finalArr.addAll(left);
		finalArr.addAll(equal);
		finalArr.addAll(right);

		return finalArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		List<Integer> result = QuickSortOnePartition.quickSort(arr);

		for (int num : result) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}
