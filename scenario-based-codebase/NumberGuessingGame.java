/*
7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries
*/

import java.util.*;

public class NumberGuessingGame {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int attempts = 0;
        boolean isWon = false;

        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have only 5 attempts!");

        do {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            int diff = Math.abs(guess - number);

            if (guess == number) {
                System.out.println(" You guessed the right number!");
                System.out.println("You WON the game in " + attempts + " attempts.");
                isWon = true;
                break;
            } 
            else if (guess > number) {
                if (diff > 20)
                    System.out.println("Too High");
                else
                    System.out.println("Slightly High");
            } 
            else {
                if (diff > 20)
                    System.out.println("Too Low");
                else
                    System.out.println("Slightly Low");
            }

        } while (attempts < 5);

        if (!isWon) {
            System.out.println(" You LOST the game.");
            System.out.println("The correct number was: " + number);
        }

        sc.close();
    }
}
