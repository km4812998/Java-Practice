
import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        System.out.println("Enter The String value: ");
        
        @SuppressWarnings("resource")
        
        String str=new Scanner (System.in).nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        System.out.println("number of vowels are: "+count);
    }
}
