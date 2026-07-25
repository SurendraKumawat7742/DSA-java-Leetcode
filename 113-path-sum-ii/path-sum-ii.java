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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, targetSum, 0, res, new ArrayList<>());
        return res;
    }
    public void dfs(TreeNode root, int targetSum, int currSum, List<List<Integer>> res, List<Integer> currPath){
        if(root == null) return;
        currSum += root.val;
        currPath.add(root.val);

        if(root.left == null && root.right == null && currSum == targetSum){
            res.add(new ArrayList<>(currPath));
        }
        dfs(root.left, targetSum, currSum, res, currPath);
        dfs(root.right, targetSum, currSum, res, currPath);

        currPath.remove(currPath.size()-1);
    }
}