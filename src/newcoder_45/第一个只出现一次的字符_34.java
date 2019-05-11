package newcoder_45;

public class 第一个只出现一次的字符_34 {
	public int FirstNotRepeatingChar(String str) {
        char[] num = new char[128];
        for(int i=0;i<str.length();i++){
            num[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(num[str.charAt(i)]==1)
                return i;
        }
        return -1;
    }
}
