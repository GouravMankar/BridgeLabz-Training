import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        double base,height;
        double areaInSquareCm , areaInSquareInches;
        Scanner input = new Scanner(System.in);

        //taking input from the user 
        System.out.print("Enter the base of the triangle (in inches): ");
        base = input.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        height = input.nextDouble();

        //calculating the area
        areaInSquareCm = 0.5 * base * height;
        areaInSquareInches = areaInSquareCm * 6.4516;

        // Displaing the result
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches and " + areaInSquareCm + " square centimeters");

        input.close();

    }
}