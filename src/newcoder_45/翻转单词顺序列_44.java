package newcoder_45;

public class 翻转单词顺序列_44 {
	public String ReverseSentence(String str) {
        StringBuilder sb = new StringBuilder();
        if(str.length()<=1) return str;
        String[] tem = str.split(" ");
        for(int i=tem.length-1;i>=0;i--){
            sb.append(tem[i]+" ");
        }
        if(sb.length()==0) return str;
        return sb.substring(0,sb.length()-1);
    }
}
