package com.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		char[] str1arr = str1.toLowerCase().toCharArray();
		char[] str2arr = str2.toLowerCase().toCharArray();

		Arrays.sort(str1arr);
		Arrays.sort(str2arr);
		if (Arrays.equals(str1arr, str2arr)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
		sc.close();

	}

}
