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
            else:
                if not stk:
                    return False
                else:
                    if mp[stk[-1]] != i:
                        return False
                    else:
                        stk.pop()
        return not stk