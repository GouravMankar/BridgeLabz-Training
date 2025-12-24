import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess between 1 and 100
    public static int generateGuess() {
        return 1 + (int)(Math.random() * 100);
    }

    // Method to get feedback from the user (high/low/correct)
    public static String getFeedback(Scanner scanner) {
        System.out.print("Is the guess High, Low, or Correct? ");
        return scanner.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Think of a number between 1 and 100. Computer will try to guess!");

        int guess;
        String feedback;

        // Loop until computer guesses correctly
        do {
            guess = generateGuess();
            System.out.println("Computer guesses: " + guess);
            feedback = getFeedback(scanner);
        } while (!feedback.equals("correct"));

        // Display result
        System.out.println("Computer guessed your number!");
        scanner.close();
    }
}

