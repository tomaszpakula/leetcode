class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        min_row, max_row = 0, len(matrix)-1
        min_col, max_col = 0, len(matrix[0])-1
        arr = []
        while min_row<=max_row and min_col<=max_col:
            for col in range(min_col, max_col+1):
                arr.append(matrix[min_row][col])
            min_row+=1
            for row in range(min_row, max_row+1):
                arr.append(matrix[row][max_col])
            max_col-=1

            if min_row>max_row or min_col>max_col:
              break

            for col in range(max_col, min_col-1,-1):
                arr.append(matrix[max_row][col])
            max_row-=1
            for row in range(max_row, min_row-1, -1):
                arr.append(matrix[row][min_col])
            min_col+=1
        
        return arr