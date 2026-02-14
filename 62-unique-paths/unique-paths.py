class Solution:
    def Paths(self, m: int, n:int, paths: list[int]) -> int:
        if paths[len(paths)-m][len(paths[0])-n] != -1:
            return paths[len(paths)-m][len(paths[0])-n]

        if m == 1 or n == 1:
            paths[len(paths)-m][len(paths[0])-n] = 1
            return 1
        
        paths[len(paths)-m][len(paths[0])-n] = self.Paths(m, n-1, paths) + self.Paths(m-1, n, paths)
        return paths[len(paths)-m][len(paths[0])-n]
    
    def uniquePaths(self, m: int, n: int) -> int:
        paths = [[-1 for i in range(n)] for j in range(m)]


        return self.Paths(m, n, paths)    
        