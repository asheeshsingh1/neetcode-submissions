class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int maxi= Integer.MIN_VALUE;
        for(int buy=0;buy<prices.length-1;buy++){
            for(int sell=buy+1;sell<prices.length;sell++){
                int diff = prices[sell] - prices[buy];
                maxi = Math.max(diff,maxi);
            }    
        }
        return (maxi<0) ? 0 : maxi;
    }
}
