package newcoder_45;

import java.util.ArrayList;

public class 和为s的连续正数序列_41 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tem = new ArrayList<Integer>();
        int start = 1;int end= 2;
        int my = 0;
        while(start<sum/2+1){
            my = sum(start,end);
            if(my==sum){
                for(int i=start;i<=end;i++){
                    tem.add(i);
                }
                res.add(tem);
                tem = new ArrayList<Integer>();
                start++;
            }
            else if(my<sum){
                end++;
            }
            else if(my>sum){
                start++;
            }
        }
        return res;
    }
    public int sum(int a,int b){
        return (a+b)*(b-a+1)/2;
    }
}
