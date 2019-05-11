package newcoder_30;

import java.util.ArrayList;

public class 最小的k个数_29 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(k==0 || input.length==0 || input.length<k) return res;
        maopao(input,k);
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }
    public void maopao(int []input,int k){
        int tem = 0;
        int flag=0;
        for(int i=0;i<k;i++){
            flag=0;
            for(int j=input.length-1;j>i;j--){
                if(input[j]<input[j-1]){
                    tem = input[j];
                    input[j] = input[j-1];
                    input[j-1] = tem;
                    flag=1;
                }
            }
            if(flag==0) return;
        }
    }
}
