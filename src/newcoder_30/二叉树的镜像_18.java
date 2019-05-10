package newcoder_30;

public class 二叉树的镜像_18 {
	public void Mirror(TreeNode root) {
        if(root==null) return ;
        Mirror(root.left);
        Mirror(root.right);
        TreeNode tem;
        tem=root.right;
        root.right=root.left;
        root.left=tem;
        return;
    }
}
