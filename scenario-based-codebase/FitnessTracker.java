import java.util.Scanner;

public class FitnessTracker {

    // Method to calculate total push-ups (skipping rest days)
    public static int calculateTotal(int[] pushUps) {
        int total = 0;
        for (int dailyCount : pushUps) {
            if (dailyCount == 0) continue; // skip rest day
            total += dailyCount;
        }
        return total;
    }

    // Method to calculate average push-ups per active day
    public static double calculateAverage(int[] pushUps) {
        int total = 0, activeDays = 0;
        for (int dailyCount : pushUps) {
            if (dailyCount == 0) continue; // skip rest day
            total += dailyCount;
            activeDays++;
        }
        return activeDays > 0 ? (double) total / activeDays : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pushUps = new int[7];

        System.out.println("🏋️ Sandeep’s Fitness Challenge Tracker");
        System.out.println("Enter push-ups for 7 days (0 for rest day):");

        // Input loop
        for (int i = 0; i < pushUps.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            pushUps[i] = sc.nextInt();
        }

        // Calculate results
        int totalPushUps = calculateTotal(pushUps);
        double averagePushUps = calculateAverage(pushUps);

        // Display summary
        System.out.println("\n📊 Weekly Fitness Summary");
        System.out.println("Total Push-ups (excluding rest days): " + totalPushUps);
        System.out.println("Average Push-ups per active day: " + averagePushUps);

        sc.close();
    }
}
