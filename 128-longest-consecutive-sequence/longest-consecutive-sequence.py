class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums = set(nums)
        max_length = 0
        for num in nums:
            if num - 1 not in nums:
                elements = 1
                i = num + 1

                while i in nums:
                    elements+=1
                    i += 1
                max_length = max(max_length, elements)
        return max_length
