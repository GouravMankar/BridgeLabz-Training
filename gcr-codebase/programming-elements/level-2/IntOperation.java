import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking values from the user
        System.out.print("Enter value of Firat Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter value of Second Number: ");
        int secondNum = sc.nextInt();
        System.out.print("Enter value of Thrid Number: ");
        int thridNum = sc.nextInt();

        // Perform operations
        int result1 = firstNum + secondNum * thridNum;
        int result2 = firstNum * secondNum + thridNum;
        int result3 = thridNum + firstNum / secondNum;
        int result4 = firstNum % secondNum + thridNum;

        // dislaying ouputs
        System.out.println("The results of Int Operations are "+ result1 + ", " + result2 + ", " + result3 + ", " + result4);

        sc.close();
    }
}
