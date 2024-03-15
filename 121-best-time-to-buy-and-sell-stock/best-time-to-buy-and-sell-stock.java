class Solution {
    public int maxProfit(int[] prices) {
        int finalProfit = 0;
        int left = 0;
        int right = 1;
        int profit;

        while (right < prices.length) {
            profit = prices[right] - prices[left];
            if (profit < 0) {
                left = right;
                right++;
            }
            if (profit >= 0) {
                right += 1;
                finalProfit = Math.max(profit, finalProfit);
            }
        }

        return finalProfit;
    }
}