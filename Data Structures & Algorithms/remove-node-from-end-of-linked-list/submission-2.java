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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode temp = head;
        ListNode prev = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        if(cnt == 1 && head.next == null){
            return null;
        }
        // System.out.println(cnt);
        temp=head;
        for(int i=0;i<=cnt-n;i++){
            if(i == cnt - n){
                System.out.println(prev.val);
                System.out.println(temp.val);
                if(prev == head && i == 0){
                    System.out.println("Inside If");
                    head = temp.next;
                }
                else{
                    System.out.println("Inside else");
                    prev.next = temp.next;
                }
                break;
            }
            // System.out.println(temp.val);
            prev = temp;
            temp = temp.next;
            
        }
        
        return head;
    }
}
