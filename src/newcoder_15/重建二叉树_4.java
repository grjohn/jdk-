package newcoder_15;

import java.util.*;


public class 重建二叉树_4 {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        return help(pre,0,pre.length-1,in,0,in.length-1,map);
    }
    public TreeNode help(int [] pre,int s1,int e1,int [] in,int s2,int e2,Map<Integer,Integer> map) {
        if(s1>e1 || e1>pre.length-1 || s1<0){
            return null;
        }
        TreeNode t = new TreeNode(pre[s1]);
        int d1 = map.get(pre[s1]);    //中序分割点
        int d2 = e1-(e2-d1);    //前序分割点
        t.left = help(pre,s1+1,d2,in,s2,d1-1,map);
        t.right = help(pre,d2+1,e1,in,d1+1,e2,map);
        return t;
    }
}
