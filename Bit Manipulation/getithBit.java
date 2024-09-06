
public class getithBit {
    public static void main(String[] args) {
        System.out.println(ith_element(10, 2));
    }

    public static int ith_element(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
