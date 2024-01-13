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

