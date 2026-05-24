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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        while(lists.length > 1){
            ArrayList<ListNode> mergedList = new ArrayList<ListNode>();
            
            for(int i=0;i<lists.length;i+=2){
                ListNode l1 = lists[i];
                ListNode l2 = null;
                if(i + 1 < lists.length){
                    l2 = lists[i + 1];
                }
                mergedList.add(mergeTwoLists(l1,l2));
            }
            lists = mergedList.toArray(new ListNode[mergedList.size()]);
        }
        return lists[0];
    }

     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode start = new ListNode();
            ListNode temp = start;
            while(list1 != null && list2 != null){
                if(list1.val < list2.val){
                    temp.next = list1;
                    list1 = list1.next;
                }
                else{
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;
            }

            if(list1 != null){
                temp.next = list1;
            }
            else if(list2 != null){
                temp.next = list2;
            }
            return start.next;
        }
}
