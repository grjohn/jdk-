package newcoder_15;

public class 调整数组顺序使得奇数位于偶数前面_13 {
	//利用冒泡算法稳定性的特点
	public void reOrderArray(int [] array) {
        for(int i=0;i<array.length;i++){
            for(int j=array.length-1;j>i;j--){
                if(array[j]%2==1 && array[j-1]%2==0){
                    array[j]=array[j]^array[j-1];
                    array[j-1]=array[j]^array[j-1];
                    array[j]=array[j]^array[j-1];
                }
            }
        }
    }
}
