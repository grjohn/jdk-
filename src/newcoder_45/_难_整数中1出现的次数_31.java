package newcoder_45;

public class _难_整数中1出现的次数_31 {
	//思路：从个位开始分析，每位为1时，共有多少情况
	//http://www.mamicode.com/info-detail-2381817.html
	public int NumberOf1Between1AndN_Solution(int n) {
        if(n<1) return 0;
        int count = 0;
        int base = 1;
        int round = n;
        while(round>0){
            int weight = round%10;
            round = round/10;
            count += round*base;
            if(weight==1) count+=(n%base)+1;
            else if(weight>1) count+=base;
            base*=10;
        }
        return count;
    }
}
