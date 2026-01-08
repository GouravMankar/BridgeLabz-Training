package com.linearandbinarysearch;

public class PeakElementBinarySearch {

    // method to find a peak element index
    static int findPeak(int[] arr) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOK = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOK && rightOK) {
                return mid; 
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                
                right = mid - 1;
            } else {
                
                left = mid + 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(arr);

        if (peakIndex != -1) {
            System.out.println("A peak element is at index: " + peakIndex);
            System.out.println("Value: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
