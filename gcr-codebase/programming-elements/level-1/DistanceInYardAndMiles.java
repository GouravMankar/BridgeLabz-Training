import java.util.Scanner;
public class DistanceInYardAndMiles{

  public static void main(String []args){
    
    Scanner scanner=new Scanner(System.in);
    double distanceInFeet,miles,yard;
    

    System.out.println("Enter the distance in feet's ");
    distanceInFeet=scanner.nextInt();


    yard=distanceInFeet/3.0;
    miles=yard/1760.0;

    
    System.out.println("For the given feets "+ distanceInFeet +" the Yards are "+yard+" and miles is "+miles);

    scanner.close();
  
    }

}  