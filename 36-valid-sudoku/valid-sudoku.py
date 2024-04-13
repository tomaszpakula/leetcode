from collections import defaultdict 
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        cols = defaultdict(set)
        rows = defaultdict(set)
        blocks = defaultdict(set)

        for row in range(9):
            for col in range(9):
                number = board[row][col]
                if number == '.':
                    continue
                if number in cols[col] or number in rows[row] or number in blocks[(row//3,col//3)]:
                    return False
                else:
                    cols[col].add(number)
                    rows[row].add(number)
                    blocks[(row//3, col//3)].add(number)
    
        return True
                    
        