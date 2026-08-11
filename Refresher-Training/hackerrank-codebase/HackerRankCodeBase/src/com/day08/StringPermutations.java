package com.day08;

import java.util.*;

public class StringPermutations {

	static void permute(char[] arr, int l, int r, Set<String> result) {
		if (l == r) {
			result.add(new String(arr));
			return;
		}
		for (int i = l; i <= r; i++) {
			swap(arr, l, i);
			permute(arr, l + 1, r, result);
			swap(arr, l, i);
		}
	}

	static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Set<String> result = new TreeSet<>();
		permute(s.toCharArray(), 0, s.length() - 1, result);

		for (String str : result) {
			System.out.println(str);
		}
		sc.close();
	}
}
