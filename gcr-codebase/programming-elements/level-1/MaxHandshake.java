
import java.util.Scanner;
public class MaxHandshake{
    public static void main(String args[]){
      
      int numberOfStudents, maxHandshakes;
      Scanner scanner = new Scanner(System.in);

      // taking input from the user
      System.out.println("Enter the number of students: ");
      numberOfStudents = scanner.nextInt();

      //calculating the max hand shakes
      maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
    
      //Displaying the values 
      System.out.println("The maximum number of handshakes among " + numberOfStudents + " number of students is " + maxHandshakes);
      
      scanner.close();
     }

}