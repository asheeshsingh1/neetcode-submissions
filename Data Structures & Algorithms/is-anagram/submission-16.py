class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False

        ar1 = [0] * 26
        ar2 = [0] * 26
        for ch in s:
            idx = ord(ch) - ord('a')
            ar1[idx] += 1
        
        for ch in t:
            idx = ord(ch) - ord('a')
            ar2[idx] += 1

        for i in range(len(s)):
            idx = ord(s[i]) - ord('a')
            if ar1[idx] != ar2[idx]:
                return False
        return True