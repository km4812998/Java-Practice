public class diagonalSum {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println("Diagonal sum: " + dSum(matrix));
        System.out.println("Optimized code:- Diagonal sum is: " + Dsum(matrix));
    }

    public static int dSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // `````````````````````````OPTIMIZED VERSION OF THIS CODE````````````````````````````````//
    public static int Dsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
}