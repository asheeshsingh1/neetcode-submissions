class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dictionary: {int,int} = {}
        ans = []
        for id,i in enumerate(nums):
            diff = target - i
            if diff in dictionary:
                ans.append(dictionary[diff])
                ans.append(id)
                break
            else:
                dictionary[i] = id
        return ans