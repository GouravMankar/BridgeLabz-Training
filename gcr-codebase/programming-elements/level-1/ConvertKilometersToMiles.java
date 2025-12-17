import java.util.Scanner;
class ConvertKilometersToMiles{

 //Method for converting kilometers to miles 
 private static double convertKilometersToMiles(double kilometers){
        return kilometers * 0.621371;   
    }
  
   public static void main(String []args){
       Scanner scanner=new Scanner(System.in);

       //Taking kilometers from the user
       System.out.println("Enter kilometers");
       double kilometers=scanner.nextInt(); 

       // Printing the conver
       System.out.println("The total miles is :"+ConvertKilometersToMiles.convertKilometersToMiles(kilometers)+" mile for the given "+ kilometers+" km");

      //  closing the Scanner 
       scanner.close();
     }
}