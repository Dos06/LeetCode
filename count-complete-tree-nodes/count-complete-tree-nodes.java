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
    int count = 0;

    public int countNodes(TreeNode root) {
        recurse(root);
        return count;
    }
    
    public void recurse(TreeNode root) {
        if (root != null) {
            count++;
            recurse(root.left);
            recurse(root.right);
        }
    }
}