class Solution {
    private boolean isUniValued = true;
    void preorder(TreeNode r,int rootval){
        if(r==null) return ;

        if(r.val != rootval){
            isUniValued = false;
            return;
        }
        preorder(r.left,rootval);
        preorder(r.right,rootval);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        preorder(root,root.val);
        return isUniValued;
    }
}
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
