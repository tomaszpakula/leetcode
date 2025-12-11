class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) == 1:
            return 0

        left = 0 
        right = 1
        best_profit = 0

        while left < right and right < len(prices):
            profit = prices[right] - prices[left]
            print(profit)
            if profit < 0:
                left = right
                right = right + 1
                continue
            
            right+=1
            if right < len(prices):
                new_profit = prices[right] - prices[left]
            while left < right and right < len(prices) and new_profit > profit:
                profit = max(new_profit,0)
                right+=1
                if right < len(prices):
                    new_profit = prices[right] - prices[left]
            best_profit += profit
            left = right
            right += 1
        return best_profit