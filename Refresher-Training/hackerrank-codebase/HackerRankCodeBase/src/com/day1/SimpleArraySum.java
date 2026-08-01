package com.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {
	
	  public static int simpleArraySum(List<Integer> ar) {
		      
		      int sum=0;
		      for(Integer i:ar){
		        sum+=i;
		      }
		      return sum;
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
		System.out.println(SimpleArraySum.simpleArraySum(ar));

		sc.close();

	}

}
