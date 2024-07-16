public class TrappedWater{
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println( "total Rainwater: " +TrappedRainWater(height));
    }
    public static int TrappedRainWater(int height[]){
        int n=height.length;
        //LEFT MAX BOUNDARY -- HELPER ARRAYS
        int leftMax[] =new int [n];
        leftMax[0]=height[0];
        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        //RIGHT MAX BOUNDARY -- HELPER ARRAYS
        int rightMax[]=new int [n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int tWater=0;
        //loop
        for(int i=0;i<n;i++){
            //WATER_LEVEL= MIN(LEFT MAX,RIGHT MAX)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //TRAPPED RAIN WATER=WATER_LEVEL  -  HEIGHT[I]
            tWater += waterLevel - height[i];
        }
        return tWater;
    }
}
