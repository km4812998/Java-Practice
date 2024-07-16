public class spiralmatrix {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        printSpiral(matrix);
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int StartCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && StartCol <= endCol) {
            // TOP SIDE
            for (int j = StartCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // RIGHT SIDE
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // BOTTOM SIDE
            for (int j = endCol - 1; j >= StartCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // LEFT SIDE
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (StartCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][StartCol] + " ");
            }
            startRow++;
            StartCol++;
            endCol--;
            endRow--;

        }
    }
}
