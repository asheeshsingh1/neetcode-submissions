class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        res = 0
        curr = 0
        mp = {0:1}
        for i in nums:
            curr += i
            diff = curr - k
            res += mp.get(diff,0)
            mp[curr] = mp.get(curr,0) + 1
        return res