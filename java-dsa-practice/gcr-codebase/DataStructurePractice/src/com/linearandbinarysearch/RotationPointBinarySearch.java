package com.linearandbinarysearch;

public class RotationPointBinarySearch {

    // method to find the index of the smallest element
    static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                
                left = mid + 1;
            } else {
                
                right = mid;
            }
        }

       
        return left;
    }

    public static void main(String[] args) {

        int[] rotatedArray = {15, 18, 2, 3, 6, 12};

        int rotationIndex = findRotationPoint(rotatedArray);

        System.out.println("The rotation point (smallest element) is at index: " + rotationIndex);
        System.out.println("Value: " + rotatedArray[rotationIndex]);
    }
}
