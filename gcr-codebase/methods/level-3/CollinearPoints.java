import java.util.Scanner;

public class CollinearPoints {

    // method to check collinearity using slope
    public static boolean areCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // method to check collinearity using area
    public static boolean areCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3) {
        double area = 0.5 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter x1 y1: ");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = scanner.nextInt(),y2 = scanner.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = scanner.nextInt(), y3 = scanner.nextInt();

        // calculating collinearity
        boolean slopeCheck = areCollinearSlope(x1,y1,x2,y2,x3,y3);
        boolean areaCheck = areCollinearArea(x1,y1,x2,y2,x3,y3);

        // displaying the result
        System.out.println("Collinear by slope? " + slopeCheck);
        System.out.println("Collinear by area? " + areaCheck);

        scanner.close();
    }
}
