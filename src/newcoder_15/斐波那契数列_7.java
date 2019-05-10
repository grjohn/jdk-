package newcoder_15;

public class 斐波那契数列_7 {
	public int Fibonacci(int n) {
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 1;
        if(n<2){
            return res[n];
        }
        int tem;
        for(int i=0;i<n-1;i++){
            tem = res[0]+res[1];
            res[0] = res[1];
            res[1] = tem;
        }
        return res[1];
    }
}
