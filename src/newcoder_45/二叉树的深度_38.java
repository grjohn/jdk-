package newcoder_45;

public class 二叉树的深度_38 {
	int max = 0;
    public int TreeDepth(TreeNode root) {
        return help(root,0);
    }
    public int help(TreeNode root,int deep){
        if(root==null) return deep;
        return Math.max(deep+1,Math.max(help(root.left,deep+1),help(root.right,deep+1)));
    }
}
