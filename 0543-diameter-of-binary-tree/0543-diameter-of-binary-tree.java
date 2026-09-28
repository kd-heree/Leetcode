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
    Integer dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        longpath(root);
        return dia;
        
    }
    private int longpath(TreeNode root){
        if(root == null){
            return 0;
        }
        int lp = longpath(root.left);
        int rp = longpath(root.right);
        dia = Math.max( lp + rp, dia);
        return Math.max( lp , rp )+ 1;
    }
}