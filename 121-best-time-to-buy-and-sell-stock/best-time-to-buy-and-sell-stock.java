class Solution {
    public int maxProfit(int[] prices) {
        int bestToBuy = Integer.MAX_VALUE;
        int temporaryProfit = 0;
        int finalProfit = 0;

        for (int i = 0; i < prices.length; i++ ){
            if (prices[i] < bestToBuy){
                bestToBuy = prices[i];
            }
            temporaryProfit = prices[i] - bestToBuy;
            if (temporaryProfit > finalProfit){
                finalProfit = temporaryProfit;
            }
        }

        return finalProfit; 


    }
}