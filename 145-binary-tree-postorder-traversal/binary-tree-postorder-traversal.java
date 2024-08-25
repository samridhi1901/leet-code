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
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOder(root);
        return res;
    }

    public int postOder(TreeNode root){
        if(root == null){
            return 0;
        }
        postOder(root.left);
        postOder(root.right);
        res.add(root.val);

        return 0;
    }
}