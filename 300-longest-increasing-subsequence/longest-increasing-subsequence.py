class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        lis = [0 for i in range(len(nums))]
        maximum = 1

        for i in range(len(nums) - 1, -1, -1):
            max = 1
            for j in range(i+1, len(nums)):
                if nums[j] > nums[i] and 1 + lis[j] > max:
                    max = 1 + lis[j]
            lis[i] = max
            if lis[i] > maximum:
                maximum = lis[i]
        return maximum