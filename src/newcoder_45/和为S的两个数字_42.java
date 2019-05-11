package newcoder_45;

import java.util.ArrayList;

public class 和为S的两个数字_42 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int res1 = 0;
        int res2 = array.length-1;
        int tem;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(res1<res2){
            tem = array[res1]+array[res2];
            if(tem==sum){
                res.add(array[res1]);
                res.add(array[res2]);
                return res;
            }
            if(tem>sum){
                res2--;
            }
            else{
                res1++;
            }
        }
        return res;
    }
}
