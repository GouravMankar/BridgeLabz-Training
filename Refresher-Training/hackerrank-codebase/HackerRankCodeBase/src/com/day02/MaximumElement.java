package com.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static List<Integer> getMax(List<String> operations) {

        List<Integer> max = new ArrayList<>();
        Stack<Integer> maxValue = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            String[] operation = op.split(" ");
            if (operation[0].equals("1")) {
                stack.push(Integer.parseInt(operation[1]));
                if (maxValue.isEmpty()) {
                    maxValue.push(Integer.parseInt(operation[1]));
                } else {
                    maxValue.push(Math.max(Integer.parseInt(operation[1]), maxValue.peek()));
                }
            } else if (operation[0].equals("2")) {
                stack.pop();
                maxValue.pop();

            } else {
                max.add(maxValue.peek());
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        List<String> ops = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ops.add(sc.nextLine());
        }

        List<Integer> result = MaximumElement.getMax(ops);

        for (int num : result) {
            System.out.println(num);
        }

        sc.close();

    }

}
