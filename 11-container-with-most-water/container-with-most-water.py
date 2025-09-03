class Solution:

    def min(a,b):
        return a if a < b else b

    def maxArea(self, height: List[int]) -> int:
        a = 0
        b = len(height) - 1
        max = 0
        while a < b:
            p = (b-a) * min(height[a], height[b])
            if p > max:
                max = p
            if height[a] > height[b]:
                b -= 1
            else:
                a += 1
        return max