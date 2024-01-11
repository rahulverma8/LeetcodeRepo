class Solution {
    boolean foundSum = false;

    void traversencheck(TreeNode root,int cur,int targetSum){   
        if(root==null) return;

        cur+= root.val;
        if(cur==targetSum && root.left==null && root.right==null){
            foundSum=true;
            return;
        }
        
        traversencheck(root.left,cur,targetSum);
        traversencheck(root.right,cur,targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        traversencheck(root,0,targetSum);
        return foundSum;
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
