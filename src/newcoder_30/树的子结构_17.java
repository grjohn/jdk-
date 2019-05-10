package newcoder_30;
import java.util.*;
public class 树的子结构_17 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null) return false;
        if(root1==null) return false;
        if(ispart(root1,root2)) return true;
        else{
            return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
        }
    }
    public boolean ispart(TreeNode root1,TreeNode root2){        //root2不为Null
        if(root1==null){
            return false;
        }
        if(root1.val==root2.val){
            if(root2.left==null && root2.right==null) return true;
            if(root2.left!=null && root2.right==null) return ispart(root1.left,root2.left);
            if(root2.left==null && root2.right!=null) return ispart(root1.right,root2.right);
            return ispart(root1.left,root2.left)&&ispart(root1.right,root2.right);
        }
        return false;
        
    }
}
