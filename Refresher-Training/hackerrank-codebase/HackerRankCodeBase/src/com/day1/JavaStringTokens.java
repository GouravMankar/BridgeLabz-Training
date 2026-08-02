package com.day1;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] result = str.trim().split("[ !,?._']+");
        if (str.isBlank()) {
            System.out.println(0);
        } else {
            System.out.println(result.length);
            for (String string : result) {
                System.out.println(string);
            }
        }
        sc.close();
    }
}
