public class MatrixAdvanced {

    // method to transpose matrix
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // determinant of 2x2
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // determinant of 3x3
    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // inverse of 2x2
    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");
        double[][] result = new double[2][2];
        result[0][0] = matrix[1][1]/det;
        result[0][1] = -matrix[0][1]/det;
        result[1][0] = -matrix[1][0]/det;
        result[1][1] = matrix[0][0]/det;
        return result;
    }

    // display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix2x2 = {{4,7},{2,6}};
        System.out.println("Determinant 2x2 = " + determinant2x2(matrix2x2));
        System.out.println("Inverse 2x2:");
        displayMatrix(inverse2x2(matrix2x2));

        int[][] matrix3x3 = {{6,1,1},{4,-2,5},{2,8,7}};
        System.out.println("Determinant 3x3 = " + determinant3x3(matrix3x3));
    }
}
