class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        ns = set(nums)
        ans = 0
        for i in ns:
            if i - 1 not in ns:
                cnt = 1
                while i + 1 in ns:
                    i += 1
                    cnt += 1
                ans = max(ans,cnt)
        return ans