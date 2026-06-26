class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        x = 0
        for i in nums: x ^= i
        rm = (x & (x - 1)) ^ x
        b1,b2 =0,0
        for i in nums:
            if i & rm:
                b1 ^= i
            else:
                b2 ^= i
        return [b1,b2]