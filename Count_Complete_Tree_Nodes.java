class Solution {
    int nodesCnt;
    void preorder(TreeNode root){
        if(root==null)return;
        preorder(root.left);
        nodesCnt++;
        preorder(root.right);
    }

    public int countNodes(TreeNode root) {
        preorder(root);
        return nodesCnt;
    }
}
