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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levels = q.size();
            double sum = 0.0;
            for(int i=0; i<levels; i++){
                TreeNode f = q.remove();
                sum += f.val;
                if(f.left != null){
                    q.add(f.left);
                }
                if(f.right != null){
                    q.add(f.right);
                }
            }
            res.add(sum/levels);
        }
        return res;
    }
}