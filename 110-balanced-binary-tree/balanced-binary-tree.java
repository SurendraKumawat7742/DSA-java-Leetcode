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
//1st
    // public int height(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     return Math.max(lh,rh)+1;
    // }
    // public boolean isBalanced(TreeNode root) {
    //     if(root == null){
    //         return true;
    //     }
    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     if(Math.abs(lh-rh) > 1){
    //         return false;
    //     }
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }


//2nd
    public boolean isBalanced(TreeNode root) {
        if(solve(root)==-1){
            return false;
        }
        return true;
    }

    int solve(TreeNode root){
        if(root==null)return 0;

        int left = solve(root.left);
        if(left==-1)return -1;
        int right = solve(root.right);
        if(right==-1)return -1;

        if(Math.abs(left-right)>1)return -1;

        return 1+Math.max(left,right);
    }
}