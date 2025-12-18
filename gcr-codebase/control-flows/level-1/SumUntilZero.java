import java.util.Scanner;
    public class SumUntilZero{
        public static void main(String args[]){
            double total = 0.0, value;

             Scanner scanner = new Scanner(System.in);
             System.out.println("Enter the value : ");
             value = scanner.nextInt();

            while(value!=0)
            {
             total += value;
             System.out.println("Enter the value : ");
             value = scanner.nextInt();
            }

            //Display the total value
            System.out.println("the total of the input values is : " + total);

            scanner.close();
    }
}