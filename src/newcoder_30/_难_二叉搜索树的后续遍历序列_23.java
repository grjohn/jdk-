package newcoder_30;

public class _难_二叉搜索树的后续遍历序列_23 {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0) return false;
        return test(sequence,0,sequence.length-1);
    }
    public boolean test(int[] seq,int start,int end){
        if(start>=end) return true;
        int root = seq[end];
        int right = end-1;
        for(;right>=0;right--){
            if(seq[right]<root){
                break;
            }
        }//找到左树末尾
        for(int i=0;i<=right;i++){
            if(seq[i]>root){
                return false;
            }
        }
        return test(seq,start,right) && test(seq,right+1,end-1);
    }
}
