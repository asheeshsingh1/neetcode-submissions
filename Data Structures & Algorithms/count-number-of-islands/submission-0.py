class Solution:
    def isValidCell(self,row,col,n,m):
        if row < 0 or col < 0 or row >= n or col >= m:
            return False
        return True

    def bfs(self,visited,grid,r,c,n,m):
         que = deque()
         que.append((r,c))
         visited[r][c] = True
         while que:
            row,col = que.popleft()
            directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
            for nRow, nCol in directions:
                newRow = row + nRow
                newCol = col + nCol
                if (
                    self.isValidCell(newRow,newCol,n,m) and
                    grid[newRow][newCol] == '1' and
                    not visited[newRow][newCol]
                ):
                    visited[newRow][newCol] = True
                    que.append((newRow,newCol))

    def numIslands(self, grid: List[List[str]]) -> int:
        ans = 0
        n = len(grid)
        m = len(grid[0])
        visited = [[False for _ in range(m)] for _ in range(n)]
        for r in range(n):
            for c in range(m):
                if not visited[r][c] and grid[r][c] == '1':
                    ans += 1
                    self.bfs(visited,grid,r,c,n,m)
        return ans