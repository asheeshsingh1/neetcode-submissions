# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        def dfs(root,maxVal,ans):
            if not root:
                return
            
            if root.val >= maxVal:
                ans[0] += 1
            
            maxVal = max(maxVal,root.val)

            dfs(root.left,maxVal,ans)
            dfs(root.right,maxVal,ans)

        ans = [0]
        dfs(root,root.val,ans)
        return ans[0]