import java.util.*;
public class calculator {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
                System.out.println("enter a:");
                int a=sc.nextInt();
                System.out.println("enter b:");
                int b=sc.nextInt();
                System.out.println("enter the operator:");
                char operator=sc.next().charAt(0);
                System.out.println("the answer is:");
                switch(operator){
                    case '+' -> System.out.println(a+b);
                    case '-' -> System.out.println(a-b);
                    case '*' -> System.out.println(a*b);
                    case '/' -> System.out.println(a/b);
                    case '%' -> System.out.println(a%b);
                }
        }
    }
}
