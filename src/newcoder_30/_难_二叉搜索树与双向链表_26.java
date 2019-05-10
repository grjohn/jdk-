package newcoder_30;

public class _难_二叉搜索树与双向链表_26 {
	TreeNode head= null;
    TreeNode realhead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        help(pRootOfTree);
        return realhead;
    }
    public void help(TreeNode root){
        if(root==null) return ;
        help(root.left);
        if(head==null){
            head=root;
            realhead=root;
        }
        else{
            head.right=root;
            root.left=head;
            head=root;
        }
        help(root.right);
    }
}
