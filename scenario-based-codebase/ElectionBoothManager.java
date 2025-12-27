import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store votes for each candidate
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.print("\nEnter age of voter (or -1 to exit): ");
            int age = scanner.nextInt();

            // Exit condition
            if (age == -1) {
                System.out.println("Voting session ended.");
                break;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("Eligible to vote!");
                System.out.print("Enter your vote (1, 2, or 3): ");
                int vote = scanner.nextInt();

                // Record vote
                if (vote == 1) {
                    candidate1Votes++;
                } else if (vote == 2) {
                    candidate2Votes++;
                } else if (vote == 3) {
                    candidate3Votes++;
                } else {
                    System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        // Display results
        System.out.println("\nFinal Vote Count:");
        System.out.println("Candidate 1: " + candidate1Votes);
        System.out.println("Candidate 2: " + candidate2Votes);
        System.out.println("Candidate 3: " + candidate3Votes);

        scanner.close();
    }
}
