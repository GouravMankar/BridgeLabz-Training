import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stopCount = 0;
        int distancePerStop = 10; // fixed distance
        char choice = 'n';

        System.out.println("Bus Route Distance Tracker");

        // Bus continues until passenger gets off
        while (choice != 'y' && choice != 'Y') {

            stopCount++;

            System.out.println("\nBus has reached Stop " + stopCount);

            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice = sc.next().charAt(0);
        }

        int totalDistance = stopCount * distancePerStop;

        System.out.println("\nPassenger got off the bus.");
        System.out.println("Total distance travelled: " + totalDistance + " km");

        sc.close();
    }
}