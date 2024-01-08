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
