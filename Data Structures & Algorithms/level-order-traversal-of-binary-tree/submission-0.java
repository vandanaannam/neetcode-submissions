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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> resCurr = new ArrayList<>();
            for(int i=0; i< level ; i++){
                TreeNode out = queue.poll();
                resCurr.add(out.val);
                if(out.left!=null){
                    queue.add(out.left);
                }
                if(out.right!=null){
                    queue.add(out.right);
                }
            }
            res.add(resCurr);
        }
        return res;

    }
}
