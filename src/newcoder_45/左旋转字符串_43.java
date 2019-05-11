package newcoder_45;

public class 左旋转字符串_43 {
	public String LeftRotateString(String str,int n) {
        if(str==null || str.length()<=0) return "";
        int length = str.length();
        int zuo = n%length;
        String s= str.substring(zuo,length);
        s+=str.substring(0,zuo);
        return s;
    }
}
