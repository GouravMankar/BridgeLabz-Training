package com.day02;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static String isBalanced(String s) {
		// Write your code here
		boolean flag = true;
		Stack<Character> paran = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
				paran.push(s.charAt(i));
			}
			if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
				if (paran.isEmpty())
					return "NO";
				char pop = paran.pop();
				if (pop == '[' && s.charAt(i) == ']') {
					flag = true;
				} else if (pop == '(' && s.charAt(i) == ')') {
					flag = true;
				} else if (pop == '{' && s.charAt(i) == '}') {
					flag = true;

				} else {
					flag = false;
					break;
				}
			}
		}
		if (!paran.isEmpty()) {
			return "NO";
		}
		return flag ? "YES" : "NO";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter brackets: ");

		String s = sc.nextLine();

		String result = isBalanced(s);

		System.out.println(result);

		sc.close();
	}

}
