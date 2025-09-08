class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = {}
        for num in nums:
            counter[num] = counter.get(num, 0) + 1

        frequency = [[] for _ in range(len(nums) + 1)]

        for key in counter:
            frequency[counter[key]].append(key)

        res = []

        for i in range(len(frequency) - 1, 0, -1):
            res += frequency[i]
            if len(res) == k:
                return res
        