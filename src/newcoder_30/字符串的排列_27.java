package newcoder_30;

import java.util.ArrayList;

public class 字符串的排列_27 {
	public ArrayList<String> Permutation(String str) {
	       ArrayList<String> res=  new ArrayList<String>();
	        if(str.length()==0) return res;
	        int[] own = new int[str.length()];
	        help(res,own,str,0,"");
	        return res;
	    }
	    public void help(ArrayList<String> res,int[] own,String str,int length,String my){
	        if(length==str.length() && !res.contains(my)){
	            res.add(my);
	            return;
	        }
	        for(int i=0;i<str.length();i++){
	            if(own[i]!=1){    //未使用
	                own[i]=1;
	                help(res,own,str,length+1,my+str.charAt(i));
	                own[i]=0;
	            }
	        }
	        return;
	    }
}
