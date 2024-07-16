import java.util.*;
public class prime {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int n=sc.nextInt();
            if(n==2){
                System.out.print(" is a prime number");
            }
            else{

                boolean isPrime =true;
                for(int i=2;i<=Math.sqrt(n);i++)
                {
                    if(n % i == 0){
                        isPrime=false;
                    }
                }
                if(isPrime==true){
                    System.out.print(" is prime number:");
                }
                else{
                    System.out.print(" is not a prime number:");
                }
            }
        }
    }
}

