import java.util.Scanner;
public class FactorialForLoop {
	public static void main(String[] args) {
		  int number, factorial = 1;
		  Scanner sc = new Scanner(System.in);

                  //Taking inputs from the user
		  System.out.println("Enter the number: ");
		  number = sc.nextInt();
		  
                  //Calculating the Factorial
		  if(number<0)
		  {
			  System.out.println("The number is not valid.");
			  return;
		  }
		  else {
                        for(int i=number; i>0; i--)
			{
				factorial *= i;
			}
				
		}

                  //Displaing the Factorial 
		  System.out.println("The factorial is " + factorial);
             
                  sc.close();
		  
	}

}