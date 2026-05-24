class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [1] * n
        # prefix
        curr = 1
        for i in range(n):
            res[i] = curr
            curr *= nums[i]

        print(res)
        # suffix
        curr = 1
        for i in range(n-1, -1, -1):
            res[i] *= curr
            curr *= nums[i]
        print(res)
        return res