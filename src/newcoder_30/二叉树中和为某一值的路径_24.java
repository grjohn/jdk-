package newcoder_30;

import java.util.ArrayList;

public class 二叉树中和为某一值的路径_24 {
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        help(res,new ArrayList<Integer>(),0,target,root);
        return res;
    }
    public void help(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> road,int sum,int target,TreeNode root)
    {
        if((sum+root.val==target) && root.left==null && root.right==null){
            road.add(root.val);
            res.add(new ArrayList<Integer>(road));
            road.remove(road.size()-1);
            return;
        }
        if(root.left!=null){
            road.add(root.val);
            sum+=root.val;
            help(res,road,sum,target,root.left);
            road.remove(road.size()-1);
            sum-=root.val;
        }
        if(root.right!=null){
            road.add(root.val);
            sum+=root.val;
            help(res,road,sum,target,root.right);
            road.remove(road.size()-1);
            sum-=root.val;
        }
    }
}
