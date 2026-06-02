class Solution:
    def isValid(self, s: str) -> bool:
        mp = {
            '(':')',
            '[':']',
            '{':'}'
        }
        stk = []
        for i in s:
            if i in mp:
                stk.append(i)
                continue
            if not stk or mp[stk.pop()] != i:
                return False            
        return not stk