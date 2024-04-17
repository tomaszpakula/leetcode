from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = defaultdict(list)
        for s in strs:
            map["".join(sorted(s))].append(s)

        results = []
        for key in map:
            results.append(map[key])         
        return results