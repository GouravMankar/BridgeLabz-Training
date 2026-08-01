package com.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
public static void plusMinus(List<Integer> arr) {
    
       int positiveCount=0,negativeCount=0,zeroCount=0;
       for(Integer i:arr){
        if(i>0){
            positiveCount++;
        }else if(i<0){
            negativeCount++;
        }else{
            zeroCount++;
        }
       }
       System.out.println((double)positiveCount/arr.size());
       System.out.println((double)negativeCount/arr.size());
       System.out.println((double)zeroCount/arr.size());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		List<Integer> ar=new ArrayList<>();
		ar.add(-1);
		ar.add(1);
		ar.add(-6);
		ar.add(8);
		ar.add(0);
		// while(sc.hasNext()) {
		// 	ar.add(sc.nextInt());
		// }
		PlusMinus.plusMinus(ar);

		sc.close();

    }


}
