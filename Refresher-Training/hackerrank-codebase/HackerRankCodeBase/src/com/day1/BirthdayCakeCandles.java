package com.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {


	public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int tall=candles.get(0);
    int count=0;
    for(int i=0;i<candles.size();i++){
        if(candles.get(i)>tall){
            tall=candles.get(i);
            count=1;
        }else if(tall==candles.get(i)){
            count++;
        }
    }
    return count;
       
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer> ar=new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(190);
		ar.add(840);
		ar.add(450);
		// while(sc.hasNext()) {
		// 	ar.add(sc.nextInt());
		// }
		System.out.println(BirthdayCakeCandles.birthdayCakeCandles(ar));

		sc.close();


	}

}
