from typing import List
class Solution:
    def minWindow(self, s: str, t: str) -> str:
        
        fixed : {str,int} = {}
        floating : {str,int} = {}
        
        for i in t:
            fixed[i] = fixed.get(i, 0) + 1
        
        l: int = 0
        r: int = 0
        mini = float("inf")
        have: int = 0
        need: int = len(fixed)
        ans: List[int] = [0] * 2

        while r < len(s):
            cc = s[r]
            floating[cc] = floating.get(cc, 0) + 1

            if cc in fixed and fixed[cc] == floating[cc]:
                have += 1
            
            while have == need:
                diff = r - l + 1
                if diff < mini:
                    ans[0] = l
                    ans[1] = r
                    mini = diff
                
                lc = s[l]
                floating[lc] -= 1
                if lc in fixed and floating[lc] < fixed[lc]:
                    have -= 1
                l += 1
            r += 1

        return s[ans[0]:ans[1] + 1] if mini != float("inf") else ""