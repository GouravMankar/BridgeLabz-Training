import java.util.Scanner;
class AreaOfCircle{
 //Method for converting celsius into Fahrenheit
 private static double areaOfCircle(double radius){
        return Math.PI*Math.pow(radius,2);
         
}
  
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);

       //Taking Radius from the user for calculating the area of a circle 
       System.out.println("Enter the Radius");
       int radius=sc.nextInt(); 
       // Printing the area of a Circle
       System.out.println("This is the area of a circle :"+AreaOfCircle.areaOfCircle(radius));
       
     }
}