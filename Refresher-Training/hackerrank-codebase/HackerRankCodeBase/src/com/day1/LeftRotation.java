package com.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

	public static List<Integer> rotLeft(List<Integer> a, int d) {
	       List<Integer>result=new ArrayList<>();
	       for(int i=d;i<a.size();i++){
	        result.add(a.get(i));
	       }
	       for(int i=0;i<d;i++){
	        result.add(a.get(i));   
	       }
	       return result;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rot=sc.nextInt();
		List<Integer> ar=new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(190);
		ar.add(840);
		ar.add(450);

		System.out.println(LeftRotation.rotLeft(ar, rot));

		sc.close();

	}

}
