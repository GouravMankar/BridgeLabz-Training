import java.util.Scanner;
public class SumOfNaturalNumbersWhileLoop{
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
         while(number>0)
         {
             sum = sum + number;
             number--;
         }
     }
  

     int sumFormula = orignalNumbersCopy * (orignalNumbersCopy+1)/2;
     if(sum == sumFormula){
     System.out.println("The Computation is correct.");
     }else{
     System.out.println("The Computation is not correct.");
 
     scanner.close();
 
     }
   }
}