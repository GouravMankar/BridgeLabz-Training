import java.util.Scanner;

public class TwoDArrayToOneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // calculating copying 2D array into 1D array
        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // displaying the result
        System.out.print("1D Array: ");
        for (int val : array) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
