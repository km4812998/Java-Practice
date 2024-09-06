
public class setIthBit {
    public static void main(String[] args) {
        System.out.println(setBit(10,2));
    }  
    public static int setBit(int n,int i){
        int BitMask=1<<i;
        return n|BitMask;
    }  
}
