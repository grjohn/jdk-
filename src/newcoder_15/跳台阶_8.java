package newcoder_15;

public class 跳台阶_8 {
	public int JumpFloor(int target) {
        if(target<=0) return 0;
        int dp[] = new int[2];
        dp[0] = 1;
        dp[1] = 2;
        if(target<2){
            return dp[target-1];
        }
        int tem;
        for(int i=0;i<target-2;i++){
            tem = dp[0]+dp[1];
            dp[0] = dp[1];
            dp[1] = tem;
        }
        return dp[1];
    }
}
