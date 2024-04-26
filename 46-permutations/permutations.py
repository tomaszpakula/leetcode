class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res=[]
        visited=[False for _ in nums]
        cur=[]
        def backtrack():
            if len(cur)==len(nums):
                res.append(cur[:])
                return
            for i in range(len(nums)):
                if visited[i]:
                    continue
                cur.append(nums[i])
                visited[i]=True
                backtrack()
                cur.pop()
                visited[i]=False
        backtrack()
        return res