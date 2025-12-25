import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if string is palindrome
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Display result
        System.out.println("Palindrome? " + isPalindrome(text));
        scanner.close();
    }
}
