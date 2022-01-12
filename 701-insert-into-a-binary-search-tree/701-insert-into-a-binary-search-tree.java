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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        var cur = root;
        while (cur != null) {
            if (val < cur.val && cur.left == null) {
                cur.left = new TreeNode(val);
                break;
            } else if (val > cur.val && cur.right == null) {
                cur.right = new TreeNode(val);
                break;
            }
            cur = val < cur.val ? cur.left : cur.right;
        }
        return root;
    }
}