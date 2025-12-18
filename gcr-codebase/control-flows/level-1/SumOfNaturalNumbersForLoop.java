import java.util.Scanner;
public class SumOfNaturalNumbersForLoop{
    public static void main(String args[]){
    
    int number, sum=0;
    Scanner scanner = new Scanner(System.in);

    //Taking inputs from the user
    System.out.println("Enter the number : ");
    number = scanner.nextInt();
    int orignalNumbersCopy = number;

    //Checking and calculatina the numbers sum
    if(number<0){
        System.out.println("The number is not a natural number.");
        return;
     }else{
         for(;number>0;number--)
         {
             sum = sum + number;
         }
     }
  

     int sumFormula = orignalNumbersCopy * (orignalNumbersCopy+1)/2;
     if(sum == sumFormula){
     System.out.println("The formula calculated answer is :" +sumFormula+ " and from Loop is :"+sum);
     System.out.println(" So The Computation is correct.");
     }else{
     System.out.println("The formula calculated answer is :" +sumFormula+ " and from Loop is :"+sum);
     System.out.println(" So The Computation is not correct.");
 
     scanner.close();
 
     }
   }
}