# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # if head == None: return []
        ahead = None
        prev = None
        curr = head
        while curr is not None:
            ahead = curr.next
            curr.next = prev
            prev = curr
            curr = ahead
        return prev