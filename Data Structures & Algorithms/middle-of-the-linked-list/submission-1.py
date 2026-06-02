class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp = head
        cnt = 0
        while temp:
            cnt += 1
            temp = temp.next
        for i in range(cnt//2):
            head = head.next
        return head