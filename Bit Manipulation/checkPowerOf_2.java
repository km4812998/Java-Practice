public class checkPowerOf_2 {
    public static void main(String[] args) {
        System.out.println(check(13));
    }    
    public static boolean check(int n){
        return (n&(n-1))==0;
    }
}
