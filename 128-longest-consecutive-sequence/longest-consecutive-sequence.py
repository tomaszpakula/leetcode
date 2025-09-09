class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        subsets = {}
        nums = set(nums)
        max_length = 0
        for num in nums:
            if num - 1 not in nums:
                new_set = set()
                new_set.add(num)
                i = num + 1

                while i in nums:
                    new_set.add(i)
                    i += 1
                subsets[num] = new_set
                max_length = max(max_length, len(new_set))
        return max_length
