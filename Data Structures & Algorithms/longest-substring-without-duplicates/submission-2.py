class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = set()
        l,r = 0, 0
        maxi = 0
        while r < len(s):
            if s[r] in seen:
                maxi = max(maxi, r - l)
                seen.remove(s[l])
                l += 1
            else:
                seen.add(s[r])
                r += 1
        maxi = max(maxi, r - l)
        return maxi