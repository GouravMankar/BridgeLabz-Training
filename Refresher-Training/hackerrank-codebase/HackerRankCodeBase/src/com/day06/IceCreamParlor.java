package com.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IceCreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        int i,j;
        if(arr.size()<2){
            return null;
        }
        for(i=0;i<arr.size();i++){
            int val=m-arr.get(i);
            for(j=i+1;j<arr.size();j++){
                if(arr.get(j)==val){
                    return Arrays.asList(i+1,j+1);
                }
            }
        }

        return null;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            List<Integer> result = icecreamParlor(m, arr);
            System.out.println(result.get(0) + " " + result.get(1));
        }
        sc.close();

	}

}
