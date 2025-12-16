import java.util.Scanner;
class CalculateAverageOfThreeNumbers{
 //Method for calculating Average of 3 numbers
 private static double calculateAverageOfThreeNumbers(double firstNum,double secondNum,double thirdNum){
        return (firstNum+secondNum+thirdNum)/3;
         
}
  
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);

       //Taking 3 Numbers from the user for Average 
       System.out.println("Enter First number");
       double firstNum=sc.nextInt(); 
       System.out.println("Enter Second Number");
       double secondNum=sc.nextInt();
       System.out.println("Enter Third Number");
       double thirdNum=sc.nextInt();
       // Printing Average of 3 numbers
       System.out.println("Average of 3 numbers is :"+CalculateAverageOfThreeNumbers.calculateAverageOfThreeNumbers(firstNum,secondNum,thirdNum));
       
     }
}