import java.util.Scanner;
public class RocketLaunchCountDown{
    public static void main(String args[]){
        int counter;
        
        //Taking the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the counter : ");
        counter = scanner.nextInt();
        System.out.println();

        while(counter>=1){
        System.out.println(counter);
        counter--;
        }

        System.out.println("Rocket launched successfully !");
        
        scanner.close();
        
   }
}