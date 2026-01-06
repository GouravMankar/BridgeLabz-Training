package com.petpal;

import java.util.Scanner;

public class PetPalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet pet = null;
        int choice;

        do {
            System.out.println("\n--- PetPal Menu ---");
            System.out.println("1. Adopt Dog");
            System.out.println("2. Adopt Cat");
            System.out.println("3. Adopt Bird");
            System.out.println("4. Feed Pet");
            System.out.println("5. Play with Pet");
            System.out.println("6. Let Pet Sleep");
            System.out.println("7. Show Pet Status");
            System.out.println("8. Make Pet Sound");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter dog name: ");
                    pet = new Dog(sc.nextLine(), 2);
                    System.out.println("Dog adopted!");
                    break;
                case 2:
                    System.out.print("Enter cat name: ");
                    pet = new Cat(sc.nextLine(), 1);
                    System.out.println("Cat adopted!");
                    break;
                case 3:
                    System.out.print("Enter bird name: ");
                    pet = new Bird(sc.nextLine(), 1);
                    System.out.println("Bird adopted!");
                    break;
                case 4:
                    if (pet != null) pet.feed();
                    else System.out.println("Adopt a pet first!");
                    break;
                case 5:
                    if (pet != null) pet.play();
                    else System.out.println("Adopt a pet first!");
                    break;
                case 6:
                    if (pet != null) pet.sleep();
                    else System.out.println("Adopt a pet first!");
                    break;
                case 7:
                    if (pet != null) pet.showStatus();
                    else System.out.println("Adopt a pet first!");
                    break;
                case 8:
                    if (pet != null) pet.makeSound();
                    else System.out.println("Adopt a pet first!");
                    break;
                case 0:
                    System.out.println("Exiting PetPal...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
