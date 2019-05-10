package newcoder_30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 从上往下打印二叉树_22 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        TreeNode tem;
        while(queue.size()!=0){
            tem=queue.poll();
            res.add(tem.val);
            if(tem.left!=null){
                queue.add(tem.left);
            }
            if(tem.right!=null){
                queue.add(tem.right);
            }
        }
        return res;
    }
}
