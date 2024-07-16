import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            int fact=1;
            System.out.print("enter any integer:");
            number=sc.nextInt();

            for(int i=1;i<=number;i++){
                fact= fact * i;
            }
            System.out.println("Factorial is:"+ fact);
        }
    }
}

// MULTIPLICATION PROGRAM




// import java.util.*;
// class MultiplicationTable {
// public static void printMultiplicationTable(int number){
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number:");
// int n = sc.nextInt();
// for(int i=1; i<=10; i++) {
// System.out.println(n + " * " + i + " = " + n*i);
// }
// }
// public static void main(String s[]) {
// printMultiplicationTable(5);
// }
// }


