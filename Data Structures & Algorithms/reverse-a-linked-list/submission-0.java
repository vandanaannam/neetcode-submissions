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
    public ListNode reverseList(ListNode head) {
        
        ListNode rev = new ListNode();
        ListNode start = rev;
        List<Integer> n = new ArrayList<>();
        if(head==null){
            return null;
        }
        while(head!=null){

            n.add(head.val);
            System.out.println(n);
            head=head.next;
        }
        // rev.val=n[i];
        System.out.println(n.size());
        for(int i=n.size()-1; i>=0 ; i--){
            if(i == n.size() -1){
                rev.val=n.get(i);
            }else{
                rev.next = new ListNode(n.get(i), null);
                System.out.println(rev.val);
                rev = rev.next;
            }
            

        }
        return start;
    }
}
