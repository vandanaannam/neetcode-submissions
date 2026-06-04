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
    public boolean hasCycle(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head.next;
        while(l1!=null && l2!=null){
            if(l1.val == l2.val){
                return true;
            }
            else{
                l1 = l1.next;
                if(l2.next!=null){
                    l2 = l2.next.next;
                }
                else{
                    return false;
                }
            }
        }
        return false;


    }
}
