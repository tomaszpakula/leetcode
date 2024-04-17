class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = s.split()
        if(len(word)!=len(pattern)): return False

        pattern_map = {}
        s_map = {}

        for i in range(len(word)):
            if word[i] not in s_map:
                s_map[word[i]] = pattern[i]
            if pattern[i] not in pattern_map:
                pattern_map[pattern[i]] = word[i]
            if s_map[word[i]] != pattern[i] or pattern_map[pattern[i]] != word[i]:
                return False
        return True