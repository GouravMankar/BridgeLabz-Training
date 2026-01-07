package com.edumentor;
import java.util.*;

public class EduMentorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Learner l = new Learner(1, "Gourav", "g@gmail.com");
        Quiz q = new Quiz("Java is OOP?", "yes");

        int ch;
        do {
            System.out.println("\n--- EduMentor Menu ---");
            System.out.println("1. Attempt Quiz");
            System.out.println("2. Generate Certificate");
            System.out.println("0. Exit");
            ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Your answer: ");
                    String ans = sc.nextLine();
                    q.submitAnswer(ans);
                    System.out.println("Score: " + q.getScore());
                    break;
                case 2:
                    l.generateCertificate();
                    break;
            }
        } while (ch != 0);
    }
}
