from functools import reduce
class Solution(object):
    def twoSum(self, nums, target):
        map = {} 
        for i, num in enumerate(nums):
            dif = target - num
            if dif in map:
                return [map[dif],i]
            else:
                map[num] = i