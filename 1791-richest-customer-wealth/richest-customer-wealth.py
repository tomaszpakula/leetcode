class Solution(object):
    def maximumWealth(self, accounts):
        maxSum = 0
        for customer in accounts:
            sum = 0
            for bank in customer:
                sum+=bank
            if sum>maxSum:
                maxSum=sum
        return maxSum