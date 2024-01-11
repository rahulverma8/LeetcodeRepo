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
