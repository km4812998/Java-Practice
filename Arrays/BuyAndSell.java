public class BuyAndSell {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("total maxProfit is: " + BuyAndSellStocks(prices));
    }

    public static int BuyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){ //PROFIT LOOPS
            if(buyPrice < prices[i]){
                int profit=prices[i] - buyPrice; //TODAY'S PROFIT
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}


