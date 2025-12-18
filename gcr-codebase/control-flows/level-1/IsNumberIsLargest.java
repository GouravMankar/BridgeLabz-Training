// Write a program to check if the first, second, or third number is the largest of the three.

import java.util.Scanner;
public class IsNumberIsLargest{
    public static void main(String args[]){
        int firstNum, secondNum, thirdNum;
        boolean isFirstLargest , isSecondLargest , isThirdLargest ;
        
        //Taking the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        firstNum = scanner.nextInt();
        System.out.println("Enter the number2 : ");
        secondNum = scanner.nextInt();
        System.out.println("Enter the number3 : ");
        thirdNum = scanner.nextInt();

        // Checks the cases
         isFirstLargest  = (firstNum > secondNum) && (firstNum > thirdNum);
         isSecondLargest = (secondNum > firstNum) && (secondNum > thirdNum);
         isThirdLargest  = (thirdNum > firstNum) && (thirdNum > secondNum);

        // Printing Output
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        scanner.close();
    }
}