class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp = {}
        ans = []
        for i in strs:
            k = [0] * 26
            for j in i:
                idx = ord(j) - ord('a')
                k[idx] += 1
            if tuple(k) in mp:
                mp[tuple(k)].append(i)
            else:
                mp[tuple(k)] = [i]
        for k,v in mp.items():
            ans.append(v)
        return ans