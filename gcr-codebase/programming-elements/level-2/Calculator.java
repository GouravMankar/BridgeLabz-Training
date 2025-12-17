import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double addition,subtraction,multiplication,division;
        double firstNumber,secondNumber;

        //taking inputs from the user 
        System.out.println("Enter the first number");
        firstNumber=scanner.nextDouble();
        System.out.println("Enter the Secomd number");
        secondNumber=scanner.nextDouble();

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
