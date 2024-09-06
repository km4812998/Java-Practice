public class function_1{
    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void Calcsum(int a,int b){ //parameters or formal parameters :- function definition
        int sum=a+b;
        System.out.println("sum is:"+sum);
    }

    // PRIME NUMBER 

    public  static  boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i==0){
                isPrime =false;
                break;
            }
        }
        return isPrime;
    }

    //PRIME NUMBER UPTO RANGE

    public static void primesInrange(int n){
        for (int i = 2; i <=n; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    //BINARY TO DECIMAL

    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int dec=0;

        while(binNum > 0){
            int lastDigit=binNum % 10;
            dec=dec + (lastDigit * (int)Math.pow(2,pow));
            pow ++;
            binNum=binNum/10;

        }
        System.out.println("decimal of " + myNum + " = " + dec);
    }

    //DECIMAL TO BINARY

    public static void decToBin(int n){
        int myNum =n;
        int pow=0;
        int binNum=0;

        while( n> 0){
            int rem = n % 2;
            binNum=binNum + (rem * (int)(Math.pow(10,pow)));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of " + myNum + " = " +binNum);
    }


    public static void main(String args[]) {
        //function call
        // // printhelloworld();


        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the 1st value: ");
        // int a=sc.nextInt();
        // System.out.println("enter the 2nd value: ");
        // int b=sc.nextInt();


        // Calcsum(a,b); // arguments or  actual parameters :- function call


        // System.out.print(isPrime(5));


        // primesInrange(100); PRIME NUMBER IN RANGE


        // binToDec(100000000); BINARY TO DECIMAL VALUE


        // decToBin(128); DECIMAL TO BINARY 
    }
}
