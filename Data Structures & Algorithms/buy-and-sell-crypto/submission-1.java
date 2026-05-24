class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1,maxi=0;
        while(r<prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxi = Math.max(profit,maxi);
            }
            else{
                l = r;
            }
            r++;
        }
        return maxi;
    }
}
