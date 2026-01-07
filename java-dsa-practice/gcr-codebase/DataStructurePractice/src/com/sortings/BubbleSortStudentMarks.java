package com.sortings;

public class BubbleSortStudentMarks {

    public static void main(String[] args) {

        int[] marks = {78, 45, 90, 66, 82, 54};
        int n = marks.length;

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                
                if (marks[j] > marks[j + 1]) {
                    
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Student marks in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}

