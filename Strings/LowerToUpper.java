import java.util.Scanner;
public class LowerToUpper {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        char ch,cap;
        System.out.println("enter the small letters: ");
        ch=sc.next().charAt(0);

        //FOR LOWER TO UPPER CASE
        cap=(char)(ch-32);



        //FOR UPPER TO LOWER CASE
        // cap=(char)(ch+32); 
        System.out.println("capital letters are: "+cap);
    }
}
