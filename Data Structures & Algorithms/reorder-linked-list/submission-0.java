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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode head2 = head;
        int count = 0;
        while(head2!=null){
            count++;
            stack.push(head2);
            head2 = head2.next;
        }
        ListNode output = head;
        head = head.next;
        int c = 1;
        while(c < count ){
            System.out.println(head.val);
            if(c%2 == 0){
                output.next = new ListNode(head.val,null);
                head = head.next;
            }
            else{
                output.next = new ListNode(stack.pop().val,null);
            }
            c++;
            
            output = output.next;
        }
    }
}
