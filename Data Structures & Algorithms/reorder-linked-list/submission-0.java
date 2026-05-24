/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    // 1 2 3 4 5 6 7 8
    //       s       f
    public void reorderList(ListNode head) {
        // Find Middle
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // System.out.println(slow.val);

        // Reverse right half
        ListNode second = slow.next;
        ListNode prev = null;
        ListNode temp = null;
        slow.next = null;
        while(second != null){
            temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        ListNode first = head;
        second = prev;
        ListNode temp1=null, temp2=null;
        while(second != null){
            temp1 = first.next;
            temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
            // System.out.println(second.val);
        }
        // while(first != null){
        //     System.out.println(first.val);
        //     first = first.next;
        // }
    }
}
