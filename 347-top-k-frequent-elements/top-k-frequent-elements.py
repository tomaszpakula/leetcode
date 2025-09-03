class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dictionary = {}
        #O(n)
        for num in nums:
            if num not in dictionary:
                dictionary[num] = 1
            else:
                dictionary[num] += 1
       
        freq = [ [] for _ in range(len(nums)+1) ]
        for key, value in dictionary.items():
            freq[value].append(key)

        res = []
        for i in range(len(freq) - 1, 0 , -1):
            for n in freq[i]:
                res.append(n)
            if len(res) == k:
                return res