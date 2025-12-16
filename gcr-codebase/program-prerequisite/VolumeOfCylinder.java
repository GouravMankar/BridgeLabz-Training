import java.util.Scanner;
class VolumeOfCylinder{
 //Method for calculating volume of a cylinder
 private static double volumeOfCylinder(double radius,double height){
        return Math.PI*Math.pow(radius,2)*height;
         
}
  
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);

       //Taking Radius and height from the user for calculating the volume of a cylinder 
       System.out.println("Enter the Radius");
       int radius=sc.nextInt(); 
       System.out.println("Enter the Height of Cylinder");
       int height=sc.nextInt();
       // Printing volume of a cylinder
       System.out.println("The Volume of Cylinder is :"+VolumeOfCylinder.volumeOfCylinder(radius,height));
       
     }
}