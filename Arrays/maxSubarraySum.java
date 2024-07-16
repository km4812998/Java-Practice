public class maxSubarraySum{
    public static void maxsubsum(int numbers[] ){
        int currSum;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                     currSum +=numbers[k];
                }
                System.out.print(currSum + " ");
                if(maxSum < currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println();
        System.out.println("maxSum=" +maxSum);

    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxsubsum(numbers);
    }
}