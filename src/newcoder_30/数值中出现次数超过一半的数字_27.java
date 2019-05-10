package newcoder_30;

public class 数值中出现次数超过一半的数字_27 {
	public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0) return 0;
        int num=array[0];
        int times=1;
        int nummax = 0;
        for(int i=1;i<array.length;i++){
            if(array[i]!=num){
                times--;
                if(times==0){
                    num=array[i];
                    times=1;
                }
            }
            else{
                times++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(num==array[i]) nummax++;
        }
        if(nummax>array.length/2) return num;
        
        return 0;
    }
}
