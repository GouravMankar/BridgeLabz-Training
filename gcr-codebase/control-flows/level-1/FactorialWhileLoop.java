// Write a Program to find the factorial of an integer entered by the user.

import java.util.Scanner;
public class FactorialWhileLoop {
	public static void main(String[] args) {
		int number, factorial = 1;
		Scanner sc = new Scanner(System.in);

                 //Taking inputs from the user
		  System.out.println("Enter the number: ");
		  number = sc.nextInt();
		  

                  //Calculating the factorial 
		  if(number<0)
		  {
			  System.out.println("The number is not valid.");
			  return;
		  }
		  else {
			while(number>0)
			{
				factorial *= number;
				number--;
			}
				
		}

                  //Displaying the Factorial 
		  System.out.println("The factorial is " + factorial);

                 sc.close();
		  
	}

}