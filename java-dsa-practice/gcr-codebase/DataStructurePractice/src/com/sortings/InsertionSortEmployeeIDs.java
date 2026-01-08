package com.sortings;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        int[] empIds = {105, 102, 110, 101, 108};
        int n = empIds.length;

        
        for (int i = 1; i < n; i++) {

            int key = empIds[i];   
            int j = i - 1;

           
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            
            
            empIds[j + 1] = key;
        }

        
        System.out.println("Employee IDs in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(empIds[i] + " ");
        }
    }
}

