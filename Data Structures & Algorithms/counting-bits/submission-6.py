class Solution:
    def countBits(self, n: int) -> List[int]:
        ans = []
        for i in range(0,n+1):
            cnt = 0
            while i > 0:
                cnt += i & 1
                i = i >> 1
            ans.append(cnt)
        return ans