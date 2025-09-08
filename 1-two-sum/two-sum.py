class Solution(object):
    def twoSum(self, nums, target):
        dic = {}
        for i, num in enumerate(nums):
            to_search = target - num
            if to_search in dic:
                return [i, dic[to_search]]
            dic[num] = i
        