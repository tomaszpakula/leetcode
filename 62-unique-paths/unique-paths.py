class Solution:
    def Paths(self, m: int, n:int, paths: list[int]) -> int:
        M, N = len(paths)-m, len(paths[0])-n
        if paths[M][N] != -1:
            return paths[M][N]

        if m == 1 or n == 1:
            paths[M][N] = 1
            return 1
        
        paths[M][N] = self.Paths(m, n-1, paths) + self.Paths(m-1, n, paths)
        return paths[M][N]
    
    def uniquePaths(self, m: int, n: int) -> int:
        paths = [[-1 for i in range(n)] for j in range(m)]
        return self.Paths(m, n, paths)    
        