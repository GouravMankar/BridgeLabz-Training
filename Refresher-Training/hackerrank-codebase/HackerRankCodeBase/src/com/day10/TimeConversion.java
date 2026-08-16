package com.day10;

import java.util.Scanner;

class TimeConversion{

    public static String timeConversion(String s) {

        if (s.charAt(8) == 'P') {

            if (Integer.parseInt(s.substring(0, 2)) != 12) {
                int hour = 12 + Integer.parseInt(s.substring(0, 2));
                return hour + s.substring(2, 8);
            }

            return s.substring(0, 8);

        } else {

            if (Integer.parseInt(s.substring(0, 2)) == 12) {
                return "00" + s.substring(2, 8);
            }

            return s.substring(0, 8);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = timeConversion(s);

        System.out.println(result);

        sc.close();
    }
}