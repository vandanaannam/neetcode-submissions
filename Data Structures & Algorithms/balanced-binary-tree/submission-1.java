/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int h1 = high(left);
        int h2 = high(right);
        if(Math.abs(h1-h2)<=1 && isBalanced(left) && isBalanced(right)){
            return true;
        }
        else{
            return false;
        }
        
    }
    public int high(TreeNode n){
        if(n==null){
            return 0;
        }
        int l = high(n.left);
        int r = high(n.right);
        return Math.max(l,r)+1;
    }
}
