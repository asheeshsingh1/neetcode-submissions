class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        lSum = 0
        total = sum(nums)
        for i,v in enumerate(nums):
            rSum = total - lSum - v
            if lSum == rSum:
                return i
            lSum += v
        return -1