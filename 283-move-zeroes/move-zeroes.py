class Solution(object):
    def moveZeroes(self, nums):
        not_zeros = list(filter(lambda n: n!=0,nums))
        for i in range(len(nums)):
            if i < len(not_zeros):
                nums[i] = not_zeros[i]
            else:
                nums[i]=0
        return nums
        