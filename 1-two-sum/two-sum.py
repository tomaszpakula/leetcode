class Solution(object):
    def twoSum(self, nums, target):
        numbers = {}
        for i,num in enumerate(nums):
            if num in numbers:
                return [i, numbers[num]]
            numbers[target - num] = i
        print(numbers)