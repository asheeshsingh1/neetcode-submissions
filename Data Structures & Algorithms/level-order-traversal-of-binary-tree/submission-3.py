# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        que = deque()
        ans = []
        que.append(root)
        while que:
            n = len(que)
            level = []
            for i in range(n):
                node = que.popleft()
                if node:
                    level.append(node.val)
                    if node.left: que.append(node.left)
                    if node.right: que.append(node.right)
            if level: ans.append(level)
        return ans