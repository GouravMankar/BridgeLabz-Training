import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        double heightCm;
        double totalInches;
        double feet;


        Scanner input = new Scanner(System.in);
        //Taking Height in cm from the user 
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        //calculating Total inches and feet
        totalInches = heightCm / 2.54;   
        feet = totalInches / 12; 


        //Display the output
        System.out.println( "Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + totalInches );
        
       // Closing the Scanner
       input.close();
    }
}