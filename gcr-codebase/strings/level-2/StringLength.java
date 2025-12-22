import java.util.Scanner;

public class StringLength {

    // User-defined method to find string length without using length()
    public static int findStringLength(String str) {
        int count = 0;

        try {
            // Infinite loop
            for (;;) {
                str.charAt(count); 
                count++ ;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input using next()
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Call user-defined method
        int customLength = findStringLength(input);

        // Call built-in length() method
        int builtInLength = input.length();

        // Display results
        System.out.println("Length without using length() method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);
    }
}
