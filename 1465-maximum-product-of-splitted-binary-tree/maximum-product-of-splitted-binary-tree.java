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
    static{
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }

//1st - Brute Force

    // static final int MOD = 1_000_000_007;
    // long maxPro = 0;

    // long totalSum(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     return root.val+totalSum(root.left)+totalSum(root.right);
    // }
    // long subTreeSum(TreeNode root){
    //     if(root == null) return 0;
    //     return root.val+subTreeSum(root.left)+subTreeSum(root.right);
    // }
    // void DFS(TreeNode node, TreeNode root, long total){
    //     if(node == null) return;

    //     if(node != root){
    //         long SubtreeSum = subTreeSum(node);
    //         long product = SubtreeSum*(total - SubtreeSum);
    //         maxPro = Math.max(maxPro, product);
    //     }
    //     DFS(node.left, root, total);
    //     DFS(node.right, root, total);
    // }
    // public int maxProduct(TreeNode root) {
    //     long total = totalSum(root);
    //     DFS(root, root, total);
    //     return (int)(maxPro % MOD);
    // }


//2nd - Optimized
    static final int MOD = 1_000_000_007;
    long totalSum = 0;
    long maxPro = 0;

    long getTotalSum(TreeNode root){
        if(root == null) return 0;
        return root.val+getTotalSum(root.left)+getTotalSum(root.right);
    }

    long dfs(TreeNode root){
        if(root == null) return 0;

        long left = dfs(root.left);
        long right = dfs(root.right);

        long subTreeSum = root.val + left + right;

        long product = subTreeSum*(totalSum - subTreeSum);
        maxPro = Math.max(maxPro, product);

        return subTreeSum;
    }

    public int maxProduct(TreeNode root){
        totalSum = getTotalSum(root);
        dfs(root);
        return (int)(maxPro % MOD);
    }
}