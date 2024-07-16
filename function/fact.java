
public class fact {
    public static int factorial(int n){
        int f=1;

        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoff(int n,int r){
        int fact_n=factorial(n);   //factorial helper function
        int fact_r=factorial(r);   //factorial helper function
        int fact_nmr=factorial(n-r);   //factorial helper function

        int bincoff=fact_n/(fact_r * fact_nmr);
        return bincoff;
    }

    public static void main(String args[]){
        System.out.println(bincoff(5,2));
    }
}
