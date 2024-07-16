import java.util.Scanner;

public class function1 {
    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void Calcsum(int a,int b){ //parameters or formal parameters :- functoin definition
        int sum=a+b;
        System.out.println("sum is:"+sum);
    }
    public static void main(String args[]) {
        try (//function call
                // printhelloworld();
        Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the 1st value: ");
            int a=sc.nextInt();
            System.out.println("enter the 2nd value: ");
            int b=sc.nextInt();
            Calcsum(a,b); // arguments or  actual parameters :- function call
        }
    }
}