import java.util.Scanner;
class PerimeterOfRectangle{
 //Method for calculating volume of a cylinder
 private static double perimeterOfRectangle(double length,double width){
        return 2*(length+width);
         
}
  
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);

       //Taking Radius and height from the user for finding the Perimeter of a Rectangle
       System.out.println("Enter the length");
       double length=sc.nextInt(); 
       System.out.println("Enter the width");
       double width=sc.nextInt();
       // Printing Perimeter of a Rectangle
       System.out.println("Perimeter of a Rectangle is :"+PerimeterOfRectangle.perimeterOfRectangle(length,width));
       
     }
}