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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sumLeft = 0, sumRight = 0;
        if (root == null)
            return 0;
        if (root.val > low)
            sumLeft = rangeSumBST(root.left, low, high);
        if (root.val <= high)
            sumRight = rangeSumBST(root.right, low, high);
        if (root.val >= low && root.val <= high)
            return root.val + sumLeft + sumRight;
        return sumLeft + sumRight;
    }
}