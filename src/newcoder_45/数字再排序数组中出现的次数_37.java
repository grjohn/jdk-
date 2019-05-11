package newcoder_45;

public class 数字再排序数组中出现的次数_37 {
	public int GetNumberOfK(int [] array , int k) {
	       int num = 0;
	        for(int i:array){
	            if(i==k) num++;
	        }
	        return num;
	    }
}
