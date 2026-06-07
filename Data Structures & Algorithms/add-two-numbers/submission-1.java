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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        ListNode curr = l1;
        ListNode curr2 = l2;

        while(curr!=null){
            st1.push(curr.val);
            curr = curr.next;
        }
        while(curr2!=null){
            st2.push(curr2.val);
            curr2 = curr2.next;
        }
        int c=0;
        Stack<Integer> st3=new Stack<>();
        while(l1!=null && l2!=null){
            int sum = st1.pop() + st2.pop() + c;
            c=0;
            int ans = sum/2;
            if(ans>=5){
                String x = String.valueOf(sum);
                c = Integer.parseInt(String.valueOf(x.charAt(0)));
                st3.push(Integer.parseInt(String.valueOf(x.charAt(1))));
            }
            else{
                st3.push(sum);
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        
        ListNode out = new ListNode(st3.pop());
        ListNode head = out;
        while(!st3.isEmpty()){
            head.next = new ListNode( st3.pop());
            head= head.next;
        }
        if(c!=0){
            head.next=new ListNode(c);
        }
        return out;
    }
}
