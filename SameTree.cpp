class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
                if(p!=q){
            if(p==nullptr || q==nullptr) return false;
        } 
        else return true;
        if(p->val != q->val) return false;
        
        return (isSameTree(p->left,q->left))&&(isSameTree(p->right,q->right));

    }
};
