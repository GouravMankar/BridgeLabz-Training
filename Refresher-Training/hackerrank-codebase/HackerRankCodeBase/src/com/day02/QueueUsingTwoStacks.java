package com.day02;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> firstStack = new Stack<>();
		Stack<Integer> secondStack = new Stack<>();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String[] operation = sc.nextLine().split(" ");
			if (operation[0].equals("1")) {
				firstStack.push(Integer.parseInt(operation[1]));
			} else if (operation[0].equals("2")) {
				if (secondStack.isEmpty()) {
					while (!firstStack.isEmpty()) {
						secondStack.push(firstStack.pop());
					}
				}
				secondStack.pop();

			} else {
				if (secondStack.isEmpty()) {
					while (!firstStack.isEmpty()) {
						secondStack.push(firstStack.pop());
					}
				}
				System.out.println(secondStack.peek());
			}
		}
		sc.close();

	}

}
