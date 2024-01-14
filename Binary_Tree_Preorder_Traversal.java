class Solution {
    List<Integer> resList = new ArrayList<>(); 
    void preorder(TreeNode root){
        if(root==null) return;
        resList.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return resList;
    }
}
