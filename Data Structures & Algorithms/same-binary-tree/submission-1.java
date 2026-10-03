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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: Both nodes are null, meaning we've reached the end of identical branches
        if (p == null && q == null) {
            return true;
        }
        
        // Base case: One node is null or the values differ, meaning the trees don't match
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        
        // Recursive step: Both current nodes match, so check their left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}