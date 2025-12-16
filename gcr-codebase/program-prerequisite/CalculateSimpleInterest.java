import java.util.Scanner;
class CalculateSimpleInterest{
 //Method for calculating simple interest
 private static double calculateSimpleInterest(double principal,double rate,int time){
        return (principal*rate*time)/100;
         
}
  
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);

       //Taking Principal,Rate of interest and time in months from the user for calculating simple interest 
       System.out.println("Enter the Principal amount");
       double principal=sc.nextInt(); 
       System.out.println("Enter the Rate of interest");
       double rate=sc.nextInt();
       System.out.println("Enter Time in the months ");
       int time=sc.nextInt();
       // Printing simple interest
       System.out.println("Simple interest is :"+CalculateSimpleInterest.calculateSimpleInterest(principal,rate,time));
       
     }
}