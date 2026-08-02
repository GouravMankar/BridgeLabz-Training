package com.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

	public static List<Integer> reverseArray(List<Integer> a) {
		List<Integer> result = new ArrayList<>();
		for (int i = a.size() - 1; i >= 0; i--) {
			result.add(a.get(i));
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(190);
		ar.add(840);
		ar.add(450);
		System.out.println(ReverseArray.reverseArray(ar));

		sc.close();
	}

}
