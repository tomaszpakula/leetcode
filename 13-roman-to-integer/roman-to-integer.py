class Solution:
    def romanToInt(self, s: str) -> int:
        numbers = {
            'I' : 1,
            'V' : 5,
            'X' : 10,
            'L' : 50,
            'C' : 100,
            'D' : 500,
            'M' : 1000
        }

        number = numbers[s[0]]

        for i in range(1,len(s)):
            number += numbers[s[i]]
            if numbers[s[i]] > numbers[s[i-1]]:
                number -= 2*numbers[s[i-1]]
        
        return number