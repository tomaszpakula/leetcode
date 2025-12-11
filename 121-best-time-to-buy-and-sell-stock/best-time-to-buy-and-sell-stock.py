class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        best_profit = 0
        if len(prices) == 1:
            return 0
        left = 0 
        right = left + 1

        while right < len(prices) and left < right:
            new_profit = prices[right] - prices[left]
            if new_profit < 0:
                left = right
                right += 1
            elif new_profit > best_profit:
                best_profit = new_profit
                right += 1
            else:
                right +=1
        return best_profit
        