import java.util.Scanner;

public class YoungestFriend {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();

        // Evaluating youngest and tallest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest: Amar");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest: Amar");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }

        
        sc.close();
    }
}
