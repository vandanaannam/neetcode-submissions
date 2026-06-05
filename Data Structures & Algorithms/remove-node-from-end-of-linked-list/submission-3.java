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
        int size = 0;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        ListNode it = head;
        for(int i =0; i< size ; i++){
            
            if(size-n-1 == i || size-n-1 == -1){
                System.out.println(i);
                if(head!=null && head.next!=null){
                    head.next = head.next.next;
                }
                else{
                    return null;
                }
                
                head = head.next;
            }
            else{
                if(head!=null){
                    
                    head = head.next;
                }
                else{
                    break;
                }
            }
            
        }
        return it;
    }
}
