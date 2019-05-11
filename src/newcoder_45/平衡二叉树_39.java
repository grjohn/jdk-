package newcoder_45;

public class 平衡二叉树_39 {
	public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return true;
        int left = treehight(root.left);
        int right = treehight(root.right);
        if(Math.abs(left-right)<=1){
            return IsBalanced_Solution(root.left) & IsBalanced_Solution(root.right);
        }
        return false;
    }
    public int treehight(TreeNode root){
        if(root==null) return 0;
        return Math.max(treehight(root.left)+1,treehight(root.right)+1);
    }
}
