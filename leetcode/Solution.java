class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int profit=0;
        int n= prices.length-1;
        for(int i=n;i>=0;i--){
            if(prices[i]>max){
                max=prices[i];
            }
            else{
                if(profit < max - prices[i]){
                    profit = max - prices[i];
                }
            }
        }
        return profit;
    }
}