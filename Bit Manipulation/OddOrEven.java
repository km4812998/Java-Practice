public class OddOrEven {
    public static void main(String[] args){
        oddandEven(10);
        oddandEven(22);
        oddandEven(20);
    }

    public static void oddandEven(int n){
        // int bitMask=1;
        if((n & 1)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
