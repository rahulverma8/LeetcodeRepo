class Solution {
    List<Integer> postList = new ArrayList<>();
    void postorder(TreeNode root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        postList.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return postList;
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
