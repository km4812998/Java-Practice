import java.util.*;
public class swap {
    public static void swap1(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a ="+a);        
        System.out.println("b ="+b);        
    }
    public static void product(int a,int b){
        int product=a*b;
        System.out.println("product is:"+product);
    }
    public static void main(String args[]){
        try (// int a=5;
                // int b=10;
                // swap1(a,b);
        Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the 1st value:");
            int a=sc.nextInt();
            System.out.println("enter the 2nd value:");
            int b=sc.nextInt();
            product(a,b);
        }
    }
}
