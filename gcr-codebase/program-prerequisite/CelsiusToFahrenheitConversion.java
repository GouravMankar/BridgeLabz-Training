import java.util.Scanner;
class CelsiusToFahrenheitConversion{
 //Method for converting celsius into Fahrenheit
 private static double celsiusToFahrenheitConversion(int celsius){
        return (celsius * 9/5) + 32;
         
}
  
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);

       //taking Celsius from the user to convert it into Fahrenheit
       System.out.println("Enter the Celsius");
       int celsius=sc.nextInt(); 
       // Printing the Fahrengeit
       System.out.println("The Celsius after conveting it into Fahrenheit is :"+CelsiusToFahrenheitConversion.celsiusToFahrenheitConversion(celsius));
       
     }
}