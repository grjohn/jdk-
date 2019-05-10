package newcoder_15;

public class 矩形覆盖_10 {
	public int RectCover(int target) {
        
        if(target<=3) return target;
        int i1=2;
        int i2=3;
        int res=0;
        int tem=3;
        while(tem<target){
            res=i1+i2;
            i1=i2;
            i2=res;
            tem++;
        }
        return res;
    }
}
