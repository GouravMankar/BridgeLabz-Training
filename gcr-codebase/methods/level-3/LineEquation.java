import java.util.Scanner;

public class LineEquation {

    // method to calculate Euclidean distance
    public static double calculateDistance(int x1,int y1,int x2,int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    // method to calculate slope and intercept
    public static double[] calculateLineEquation(int x1,int y1,int x2,int y2) {
        double m = (double)(y2-y1)/(x2-x1);
        double b = y1 - m*x1;
        return new double[]{m,b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter x1 y1: ");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();

        // calculating distance and line equation
        double distance = calculateDistance(x1,y1,x2,y2);
        double[] line = calculateLineEquation(x1,y1,x2,y2);

        // displaying the result
        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

        scanner.close();
    }
}
