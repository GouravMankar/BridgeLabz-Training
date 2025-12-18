import java.util.Scanner;
public class RocketLaunchCountDownUsingFor{
    public static void main(String args[]){
        int counter;
        
        //Taking the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the counter : ");
        counter = scanner.nextInt();
        System.out.println();

        for(;counter>0;counter--){
        System.out.println(counter);
        }

        System.out.println("Rocket launched successfully !");
        
        scanner.close();
        
   }
}