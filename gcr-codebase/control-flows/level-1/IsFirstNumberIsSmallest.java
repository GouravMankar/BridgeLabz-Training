// Write a program to check if the first is the smallest of the 3 numbers.

import java.util.Scanner;
public class IsFirstNumberIsSmallest{
    public static void main(String args[]){
        int firstNum, secondNum, thirdNum;
        boolean result;
        
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        firstNum = sc.nextInt();
        System.out.println("Enter the Second number : ");
        secondNum = sc.nextInt();
        System.out.println("Enter the Third number  : ");
        thirdNum = sc.nextInt();

        // Checking the First number is small or not
        result=firstNum < secondNum && firstNum < thirdNum;

        // Printing the output
        System.out.println("Is the first number the smallest? "+ result);
    }
}