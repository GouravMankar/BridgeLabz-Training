package com.day02;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Stack<String> operationHistory = new Stack<>();
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String[] operation = sc.nextLine().split(" ");
			if (operation[0].equals("1")) {

				operationHistory.push(string.toString());
				string.append(operation[1]);

			} else if (operation[0].equals("2")) {
				operationHistory.push(string.toString());
				string.delete(string.length() - Integer.parseInt(operation[1]), string.length());

			} else if (operation[0].equals("3")) {
				System.out.println(string.charAt(Integer.parseInt(operation[1]) - 1));
			} else {
				string = new StringBuilder(operationHistory.pop());
			}
		}
	}
}
