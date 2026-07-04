class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int i =1;
        while(i<prices.length){
            if(prices[i]-prices[i-1]>0){
                int x =prices[i]-prices[i-1];
                profit=profit+x;
                i++;
            }
            else{
                i++;
            }
        }
        return profit;
    }
}