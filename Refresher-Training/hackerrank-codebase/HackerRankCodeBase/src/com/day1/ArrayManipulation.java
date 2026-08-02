package com.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

	public static long arrayManipulation(int n, List<List<Integer>> queries) {

		long[] arr = new long[n + 2];
		for (List<Integer> innerList : queries) {
			int start = innerList.get(0);
			int end = innerList.get(1);
			int value = innerList.get(2);
			arr[start] += value;
			arr[end + 1] -= value;
		}
		long result = Long.MIN_VALUE;
		long current = 0;
		for (int i = 1; i < n; i++) {
			current += arr[i];
			result = Math.max(result, current);
		}
		return result;

	}

	public static void main(String[] args) {

		List<List<Integer>> queries = new ArrayList<>();

		queries.add(Arrays.asList(1, 5, 3));
		queries.add(Arrays.asList(4, 8, 7));
		queries.add(Arrays.asList(6, 9, 1));

		int n = 10;
		System.out.println(ArrayManipulation.arrayManipulation(n, queries));

	}

}
