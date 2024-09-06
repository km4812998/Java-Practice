public class swapWithoutThirdvariable {
    public static void main(String[] args) {
        int a=3;
        int b=8;
        System.out.println("Before swap a = " + a + " and b = " + b);
        a = a ^ b;
        b= a ^ b;
        a= a ^ b;
        System.out.println("After swap a = " + a + " and b = " + b);
    }
}
