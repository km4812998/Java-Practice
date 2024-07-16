
import java.util.*;
public class InputArr{
    public static void main(String args[]){
        //AN EMPTY ARRAY OF LENGTH 100
        int marks[] =new int[100];
        System.out.println("Length of an array:" + marks.length);

        //HOW TO TAKE AN INPUT IN AN ARRAY
        System.out.println("enter the marks");
        try (Scanner sc = new Scanner(System.in)) {
            marks[0]=sc.nextInt();
            marks[1]=sc.nextInt();
            marks[2]=sc.nextInt();
        }
        System.out.println("phy:" + marks[0]);
        System.out.println("che:" + marks[1]);
        System.out.println("maths:" + marks[2]);


        //UPDATE AN ARRAY
        marks[2] = marks[2] + 5;
        System.out.println("updated maths marks:" +marks[2]);


        //PERCENTAGE OF AN ARRAY
        int percentage=(marks[0] +marks[1] + marks[2])/3;
        System.out.println("percentage is:" +percentage); 
    }
}

