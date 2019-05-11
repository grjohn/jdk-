package newcoder_30;

public class 连续子数组的最大和_30 {
	public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int res = Integer.MIN_VALUE;
        for(int i=1;i<array.length;i++){
            max = Math.max(array[i]+max,array[i]);
            res = Math.max(res,max);
        }
        return res;
    }
}
