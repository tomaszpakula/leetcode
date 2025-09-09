class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        product = 1
        zero_indices = set()
        for i in range(len(nums)):
            if nums[i] == 0:
                zero_indices.add(i)
            else:
                product *= nums[i]
        products = []
        if len(zero_indices) == len(nums):
            return [0 for i in nums]
        for num in nums:
            if len(zero_indices) == 0:
                products.append(int(product/num))
            elif num == 0 and len(zero_indices) == 1:
                products.append(product)
            else:
                products.append(0)
        return products