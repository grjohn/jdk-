package newcoder_45;

public class _难_丑数_33 {
	//三个标志位维护第一个一个大于当前丑数的index和数值
	public int GetUglyNumber_Solution(int index) {
        if(index==0) return 0;
        int[] res = new int[index];
        res[0]=1;
        int i=1;
        int thisugly = 0;
        int max2 = 0,max3 = 0,max5 = 0;
        int num = 1;
        while(i<index){
            thisugly = Math.min(res[max2]*2,Math.min(res[max3]*3,res[max5]*5));
            res[num] = thisugly;
            while(res[num]>=res[max2]*2) max2++;
            while(res[num]>=res[max3]*3) max3++;
            while(res[num]>=res[max5]*5) max5++;
            num++;
            i++;
        }
        return res[index-1];
    }
}
