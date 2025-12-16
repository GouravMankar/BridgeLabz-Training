import java.util.Scanner;
class ConvertKilometersToMiles{
 //Method for calculating Average of 3 numbers
 private static double convertKilometersToMiles(double kilometers){
        return kilometers * 0.621371;
         
}
  
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);

       //Taking 3 Numbers from the user for Average 
       System.out.println("Enter kilometers");
       double kilometers=sc.nextInt(); 
       // Printing Average of 3 numbers
       System.out.println("kilometers in miles is :"+ConvertKilometersToMiles.convertKilometersToMiles(kilometers));
       
     }
}