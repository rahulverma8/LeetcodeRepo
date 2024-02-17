class Solution {
    List<Integer> reslist = new ArrayList<Integer>();
    void inorder(TreeNode root){
        if(root==null) return;

        inorder(root.left);
        reslist.add(root.val);
        inorder(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return reslist;
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
