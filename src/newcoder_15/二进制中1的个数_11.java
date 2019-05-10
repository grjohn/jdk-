package newcoder_15;

public class 二进制中1的个数_11 {
	public int NumberOf1(int n) {
        //每次将二进制的最右边的1变为0，重复这个过程
        int count = 0;

        while (n != 0)
        {
            count++;
            n = (n - 1) & n;
        }

        return count;
    }
}
