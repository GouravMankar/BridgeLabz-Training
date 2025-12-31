import java.util.Scanner;

public class TemperatureLogger {

    // Method to calculate average temperature
    public static double calculateAverage(int[] temps) {
        int sum = 0;
        for (int t : temps) {
            sum += t;
        }
        return (double) sum / temps.length;
    }

    // Method to find maximum temperature
    public static int findMaxTemperature(int[] temps) {
        int max = temps[0];
        for (int t : temps) {
            if (t > max) {
                max = t;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temperatures = new int[7];

        System.out.println("🌡️ Weekly Temperature Logger");
        System.out.println("Enter temperatures for 7 days:");

        // Input loop
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = sc.nextInt();
        }

        // Calculate results
        double average = calculateAverage(temperatures);
        int maxTemp = findMaxTemperature(temperatures);

        // Display summary
        System.out.println("\n📊 Weekly Temperature Summary");
        System.out.println("Average Temperature: " + average + "°C");
        System.out.println("Maximum Temperature: " + maxTemp + "°C");

        sc.close();
    }
}
