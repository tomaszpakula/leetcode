class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        ranges = []
        left = 0
        right = 0

        while(right < len(nums)):
            if right == len(nums)-1:
                if left == right:
                  ranges.append(f"{nums[left]}")
                else:
                  ranges.append(f"{nums[left]}->{nums[right]}")
                return ranges

            if nums[right]+1==nums[right+1]:
                right+=1
            else:
                if left==right:
                    ranges.append(f"{nums[left]}")
                else:
                    ranges.append(f"{nums[left]}->{nums[right]}")
                left, right = right+1, right+1
        return ranges