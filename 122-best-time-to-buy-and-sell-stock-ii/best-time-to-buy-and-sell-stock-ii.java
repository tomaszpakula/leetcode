class Solution {
     public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        
        int profit = 0;

        for (int left = 0; left < prices.length - 1; left++) {
            if (prices[left] < prices[left+1]) {
                profit += (prices[left+1] - prices[left]);
            }
        }

        return profit;
    }
}