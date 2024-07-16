public class transpose {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };
        // Display original matrix
        printMatrix(matrix);
        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // print the transposed matrix
        printMatrix(transpose);
    }
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}
