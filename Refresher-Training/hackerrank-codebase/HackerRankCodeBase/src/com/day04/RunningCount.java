package com.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningCount {
	public static int runningTime(List<Integer> arr) {
	    // Write your code here
	    int count=0;
	        for (int i = 1; i < arr.size(); i++) {

	            int key = arr.get(i);
	            int j = i - 1;

	            while (j >= 0 && arr.get(j) > key) {

	                arr.set(j + 1, arr.get(j));
	                j--;
	                count++;
	            }

	            arr.set(j + 1, key);

	        
	        }
	        return count;
	    }

	public static void main(String[] args) {
		
        List<Integer> arr = new ArrayList<>(
                Arrays.asList(2, 1, 3, 1, 2)
        );

        int shifts = runningTime(arr);

        System.out.println("Number of shifts = " + shifts);

	}

}
