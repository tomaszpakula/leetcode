class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        used = {}
        for num in nums:
            if num in used:
                return True
            used[num] = 1
        return False
