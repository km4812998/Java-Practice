import java.util.Scanner;
public class character {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            char ch ='A';
            System.out.println("enter the number:");
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
}
