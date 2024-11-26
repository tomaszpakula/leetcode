class Solution(object):
    def moveZeroes(self, nums):
        j = 0
        k = 0

        while(j<len(nums) and k<len(nums)):
            if nums[j] != 0:
                nums[j],nums[k] = nums[k],nums[j]
                k+=1
            j+=1


        return nums
        