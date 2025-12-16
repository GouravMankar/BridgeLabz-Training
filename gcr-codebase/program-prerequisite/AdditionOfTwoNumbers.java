import java.util.Scanner;

class AdditionOfTwoNumbers {
     // Method for calculating the sum
     private static int sumOfTwoNumbers(int firstNum, int secondNum) {
          return firstNum + secondNum;
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          // taking numbers from the user
          System.out.println("Enter First Number :");
          int firstNum = sc.nextInt();
          System.out.println("Enter Second Number :");
          int secondNum = sc.nextInt();
          // Printing the sum of the given numbers
          System.out.println("Sum of Two Numbers is " + AdditionOfTwoNumbers.sumOfTwoNumbers(firstNum, secondNum));
          sc.close(); // closeing the Scannrer
     }
     
}