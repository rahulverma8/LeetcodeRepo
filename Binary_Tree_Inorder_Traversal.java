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
