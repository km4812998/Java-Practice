import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        System.out.print("the String is: ");
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            str=sc.nextLine();

            // String str="racecar";
            System.out.println(ispalindrome(str));
        }
    }

    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
