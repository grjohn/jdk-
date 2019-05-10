package newcoder_15;

public class 旋转数组的最小数字_6 {
	public int minNumberInRotateArray(int [] array) {
        if(array==null || array.length==0) return 0;
        if(array.length==1) return array[0];
        int start=0,end=1;
        while(end<array.length){
            if(array[end]<array[start]){
                return array[end];
            }
            start++;
            end++;
        }
        return array[0];
        
    }
}
