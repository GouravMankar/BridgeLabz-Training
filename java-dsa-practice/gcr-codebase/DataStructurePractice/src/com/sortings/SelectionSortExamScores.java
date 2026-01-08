package com.sortings;

public class SelectionSortExamScores {

    public static void main(String[] args) {

        int[] scores = {72, 88, 45, 91, 60, 79};
        int n = scores.length;

       
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

       
        System.out.println("Exam scores in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
