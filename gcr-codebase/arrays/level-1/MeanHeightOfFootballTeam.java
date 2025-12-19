import java.util.Scanner;

public class MeanHeightOfFootballTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        double[] heights = new double[11];
        double sum = 0.0;
        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
        }

        // calculating mean height
        for (double h : heights) {
            sum += h;
        }
        double mean = sum / heights.length;

        // displaying the result
        System.out.println("Mean height = " + mean);

        scanner.close();
    }
}
