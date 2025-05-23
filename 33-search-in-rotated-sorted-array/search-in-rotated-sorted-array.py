class Solution:
    def binary_search(self, nums: List[int], target: int, start: int, end: int)->int:
        mid:int = (start + end)//2

        if start == end:
            return mid if nums[mid] == target else -1
        elif nums[mid] == target:
            return mid
      
     

        if nums[start] <= nums[mid]:
            if nums[start] <= target <= nums[mid]:
                return self.binary_search(nums, target, start, mid-1)
            else:
                return self.binary_search(nums, target, mid+1, end)
               
        else:
            if nums[mid] <= target <= nums[end]:
                return self.binary_search(nums, target, mid+1, end)
            else:
                return self.binary_search(nums, target, start, mid-1)
                    

            

    def search(self, nums: List[int], target: int) -> int:
        return self.binary_search(nums, target, 0, len(nums)-1)
        