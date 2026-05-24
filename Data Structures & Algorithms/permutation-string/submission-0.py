class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2): return False
    
        l1,l2 = [0] * 26, [0] * 26
        for i in range(len(s1)):
            l1[ord(s1[i]) - ord("a")] += 1
            l2[ord(s2[i]) - ord("a")] += 1
        
        matches = 0
        for i in range(26):
            matches += (1 if l1[i] == l2[i] else 0)
        
        l = 0
        for r in range(len(s1),len(s2)):
            if matches == 26: return True

            idx = ord(s2[r]) - ord("a")
            l2[idx] += 1
            if l2[idx] == l1[idx]:
                matches += 1
            elif l1[idx] + 1 == l2[idx]:
                matches -= 1

            idx = ord(s2[l]) - ord("a")
            l2[idx] -= 1
            if l2[idx] == l1[idx]:
                matches += 1
            elif l1[idx] - 1 == l2[idx]:
                matches -= 1
            l +=1
        return matches == 26