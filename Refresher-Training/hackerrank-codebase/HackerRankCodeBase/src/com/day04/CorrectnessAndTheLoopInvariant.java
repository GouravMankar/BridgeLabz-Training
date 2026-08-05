package com.day04;

import java.util.Arrays;
import java.util.Scanner;

public class CorrectnessAndTheLoopInvariant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int[] list = new int[n];
         for(int i=0;i<list.length;i++){
            list[i]=sc.nextInt();
         }

        Arrays.sort(list);

        for (int val : list) {
            System.out.print(val + " ");
        }

	}

}
