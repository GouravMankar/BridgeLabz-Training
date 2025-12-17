import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        double perimeter;
        double side;
        Scanner input = new Scanner(System.in);

        //taking perimeter from the user
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        //calculating the sides
        side = perimeter / 4;

        //printing the output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter );

        input.close();
    }
}