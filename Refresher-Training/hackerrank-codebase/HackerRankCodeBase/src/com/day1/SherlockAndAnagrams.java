package com.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockAndAnagrams {

	public static int sherlockAndAnagrams(String s) {

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j <= s.length(); j++) {

				char[] arr = s.substring(i, j).toCharArray();

				Arrays.sort(arr);

				String key = new String(arr);

				map.put(key, map.getOrDefault(key, 0) + 1);
			}
		}

		int count = 0;

		for (int freq : map.values()) {

			count += (freq * (freq - 1)) / 2;
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(SherlockAndAnagrams.sherlockAndAnagrams(str));
		scanner.close();

	}

}
