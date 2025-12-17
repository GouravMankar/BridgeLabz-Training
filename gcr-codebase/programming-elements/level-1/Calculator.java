import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int addition,subtraction,multiplication,division;

        //taking inputs from the user 
        System.out.println("Enter the first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter the Secomd number");
        int secondNumber=scanner.nextInt();

        // doing all operations
        addition=firstNumber + secondNumber;
        subtraction=firstNumber - secondNumber;
        multiplication=firstNumber * secondNumber;
        division=firstNumber/secondNumber;
        
        //Display the output
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+firstNumber+" and "+secondNumber+" is "+ addition+","+subtraction +","+multiplication +" and " +division);

        // closing the Scanner
        scanner.close();
        
    }
}
