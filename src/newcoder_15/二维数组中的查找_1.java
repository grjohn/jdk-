package newcoder_15;

public class 二维数组中的查找_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//矩阵有序，从最左下角开始遍历，大于target 行-1.小于target 列+1,o(n)
	public boolean Find(int target, int [][] array) {
        if(array==null || array.length<1) return false;
        int high = array.length-1;
        int i=0;
        while(high>=0 && i<array[0].length){
            if(array[high][i]<target){
                i++;
            }
            else if(array[high][i]>target){
                high--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
