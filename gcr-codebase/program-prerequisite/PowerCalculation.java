import java.util.Scanner;
class PowerCalculation{
 //Method for power calculation
 private static double powerCalculation(int base,int exponent){
        return Math.pow(base,exponent);
         
}
  
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);

       //Taking Base and Exponent from the user 
       System.out.println("Enter the Base");
       int base=sc.nextInt(); 
       System.out.println("Enter the Exponent");
       int exponent=sc.nextInt();
       // Printing Perimeter of a Rectangle
       System.out.println("Power calculation from base and exponent is :"+PowerCalculation.powerCalculation(base , exponent));
       
     }
}