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
    class Result{
        TreeNode node;
        int height;
        Result(TreeNode node, int height){
            this.node = node;
            this.height = height;
        }
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return solve(root, 0).node;
    }
    public Result solve(TreeNode root, int height){
        if(root == null) return new Result(null, height);
        Result left = solve(root.left, height+1);
        Result right = solve(root.right, height+1);

        if(left.height == right.height){
            return new Result(root, left.height);
        }else{
            return left.height > right.height ? left : right;
        }
    }
}