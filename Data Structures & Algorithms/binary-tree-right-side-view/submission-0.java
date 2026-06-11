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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root==null){
            return res;
        }
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            int out = 0;
            for(int i=0; i<size ; i++){
                TreeNode node = qu.poll();
                out = node.val;
                if(node.left!=null){
                    qu.add(node.left);
                }
                if(node.right!=null){
                    qu.add(node.right);
                }
            }
            res.add(out);
        }
        return res;
    }
}
