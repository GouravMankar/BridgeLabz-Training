package com.robowarehouse;

public class ArtExpoInsertionSort {
    // Function to perform insertion sort
    public static void insertionSort(int[] times) {
        int n = times.length;
        for (int i = 1; i < n; i++) {
            int key = times[i];   // current artist's registration time
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && times[j] > key) {
                times[j + 1] = times[j];
                j = j - 1;
            }
            times[j + 1] = key;  // insert artist at correct position
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] registrationTimes = {10, 12, 15, 11, 14}; // minutes past opening

        System.out.println("Before sorting:");
        for (int time : registrationTimes) {
            System.out.print(time + " ");
        }

        insertionSort(registrationTimes);

        System.out.println("\nAfter sorting (booth assignment order):");
        for (int time : registrationTimes) {
            System.out.print(time + " ");
        }
    }
}
