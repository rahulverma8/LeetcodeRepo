class Solution {
    List<Integer> res = new ArrayList<Integer>();

    void traversePreorder(Node root){
        if(root==null) return;

        res.add(root.val);
        for(int i=0;i<root.children.size();i++)
            traversePreorder(root.children.get(i));
    }
    public List<Integer> preorder(Node root) {
        traversePreorder(root);
        return res;
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
