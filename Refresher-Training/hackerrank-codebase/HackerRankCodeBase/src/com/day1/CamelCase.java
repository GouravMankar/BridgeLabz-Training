package com.day1;

import java.util.Scanner;

public class CamelCase {

	public static int camelcase(String s) {
	       if(s.isEmpty()){
	        return 0;
	       }
	       int count=1;
	       for(int i=0;i<s.length();i++){
	        if(Character.isUpperCase(s.charAt(i))){
	            count++;
	        }
	       }
	       return count;
	       
	    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String string=sc.next();
		System.out.println(CamelCase.camelcase(string));

		sc.close();


	}

}
