/*
6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits
*/

import java.util.Scanner;

public class ParkingLotSystem {

  public static void main(String[] args) {

    // declaring variables
    Scanner scanner = new Scanner(System.in);
    final int slots = 20;
    int occupancy = 0;

    // Taking user input and checking the parking slots and printing the Output
    while (occupancy < slots) {
      System.out.println("Enter the choice(park/1, exit/2, showOccupancy/3, exitSystem/4): ");
      String choice = scanner.nextLine();

      switch (choice) {
        case "park", "1":
          System.out.println("Vehicle parked ");
          occupancy++;
          if (occupancy == slots)
            System.out.println("Slots are filled.");
          break;
        case "exit", "2":
          if (occupancy == 0)
            System.out.println("There is no vehicle parked to exit ");
          System.out.println("Vehicle exit ");
          occupancy--;
          break;
        case "showOccupancy", "3":
          System.out.println("Occupancy is: " + occupancy);
          System.out.println("Remaining slots are: " + (slots - occupancy));
          break;
        case "exitSystem", "4":
          System.out.println("ThankYou for using our Application");
          System.exit(0);
        default:
          System.out.println("Invalid Input, please enter the correct input");
      }
    }

    scanner.close();

  }

}
