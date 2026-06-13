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
    public boolean isValidBST(TreeNode root) {
        
        return isvalid(root, null, null );
    }
    public boolean isvalid(TreeNode root,Long min,Long max){
        if(root==null){
            return true;
        }
        if(min!=null && min>=root.val){
            return false;
        }
        if(max!=null && max<=root.val){
            return false;
        }
        return isvalid(root.left, min ,(long)root.val) && isvalid(root.right,(long)root.val,max);
        
    }
}
