
import java.util.Scanner;
public class SumUntilZeroOrNegative{
    public static void main(String args[]){
        double total = 0.0, value;
        Scanner sc = new Scanner(System.in);

        //taking values from the users
        System.out.println("Enter the value : ");
        value = sc.nextDouble();
        
        
        while (true){
            if(value==0 || value<0){
                break;
            }
            else{
                total += value; 
                System.out.println("Enter the value : ");
                value = sc.nextDouble();
            }
            }
         
         System.out.println("The total sum of the input values is : " + total);
    }
}