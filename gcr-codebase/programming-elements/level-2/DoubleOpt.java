import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking values from the user
        System.out.print("Enter value of Firat Number: ");
        double firstNum = sc.nextDouble();
        System.out.print("Enter value of Second Number: ");
        double secondNum = sc.nextDouble();
        System.out.print("Enter value of Thrid Number: ");
        double thridNum = sc.nextDouble();

        // Perform operations
        double result1 = firstNum + secondNum * thridNum;
        double result2 = firstNum * secondNum + thridNum;
        double result3 = thridNum + firstNum / secondNum;
        double result4 = firstNum % secondNum + thridNum;

        // Displaying outputs
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);

       sc.close();
    }
}
