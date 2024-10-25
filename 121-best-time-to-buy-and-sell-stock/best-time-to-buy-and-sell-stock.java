class Solution {
    public static int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        if(prices.length==2) return Math.max(prices[1]-prices[0], 0);

        int left = 0;
        int right = 1;
        int tempProfit = 0;

        while(right<prices.length-1){
            if(prices[left+1]<prices[left]) {
                left++;
            }
            else if(prices[right]<prices[left]){
                left = right;
            }
            tempProfit = Math.max(prices[right] - prices[left], tempProfit);
            right++;
        }
        tempProfit = Math.max(prices[right] - prices[left], tempProfit);

        return tempProfit;
    }
}