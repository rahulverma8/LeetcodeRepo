class Solution {

    private int sumofrange ;
    void traverseinorder(TreeNode root,int low,int high){
        if(root==null) return ;

        traverseinorder(root.left,low,high);
        if(root.val>=low && root.val<=high) sumofrange+=root.val;
        traverseinorder(root.right,low,high);
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        traverseinorder(root,low,high);
        return sumofrange;
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
