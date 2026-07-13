class Solution:
    def isValidCell(self,r,c,n,m):
        if r < 0 or c < 0 or r >= n or c >= m:
            return False
        return True

    def dfs(self,ans,image,iniColor,newColor,n,m,r,c):
        ans[r][c] = newColor
        directions = [(-1,0),(1,0),(0,1),(0,-1)]
        for row,col in directions:
            nrow = row + r
            ncol = col + c
            if (
                self.isValidCell(nrow,ncol,n,m) and
                image[nrow][ncol] == iniColor and
                ans[nrow][ncol] != newColor
            ):
                self.dfs(ans,image,iniColor,newColor,n,m,nrow,ncol)

    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        iniColor = image[sr][sc]
        ans = [row[:] for row in image]
        n = len(image)
        m = len(image[0])
        self.dfs(ans,image,iniColor,color,n,m,sr,sc)
        return ans