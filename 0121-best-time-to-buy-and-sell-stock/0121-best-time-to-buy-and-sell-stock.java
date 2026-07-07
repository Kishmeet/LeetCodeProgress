class Solution {
    public int maxProfit(int[] prices) {
        
        int mini=prices[0],profit=0;
        int cost=0;
        for(int i=1;i<prices.length;i++)
        {
            cost=prices[i]-mini;
            if(cost>profit)
             profit=cost;
            if(prices[i]<mini)
             mini=prices[i];
        }
        return profit;
    }
}