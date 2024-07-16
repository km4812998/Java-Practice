
import java.util.Scanner;

public class TwoDcreation{
    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        int n = matrix.length, m = matrix[0].length;  // n=3, m=3 -both way to write matrix length
        try (//input
        Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,8);
        largest(matrix);
        smallest(matrix);
    }
    // TO SEARCH ANY MATRIX
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell (" + i + ","+ j+")");
                    return true;
                }
            }
        }
        return false;
    }
    
    //largest
    public static void largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for (int[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++) {
                if (matrix1[j] > largest) {
                    largest = matrix1[j];
                }
            }
        }
        System.out.println("largest matrix:" + largest);
    }
    //smallest
    public static void smallest(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        for (int[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++) {
                if (matrix1[j] < smallest) {
                    smallest = matrix1[j];               
                }
            }
        }
        System.out.println("smallest matrix:" + smallest);
    }
}
