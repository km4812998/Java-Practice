
import java.util.Scanner;

public class stringintro {
    public static void main(String[] args){

        //ways to declare string 
        // char ch[]={'a','b','c','d'};
        // String str="Mintu";
        // String str1= new String("Mintu kumar");
        

        //String with input and length of the string
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            name=sc.nextLine();
            System.out.println(name);
            System.out.println(name.length());
        }


        //length of the string
        String name="Mintu Kumar";
        System.out.println(name);
        System.out.println("the length of this word is: "+name.length());


        //concatenate of the string

        String firstName="Kumar";
        String lastname="Mintu";
        String fullName=firstName+" "+lastname;
        System.out.println(fullName);

        //search any word from the string
        printLetters(name);
    }    
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}
