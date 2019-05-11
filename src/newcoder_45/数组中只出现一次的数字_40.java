package newcoder_45;

import java.util.HashMap;
import java.util.Map;

public class 数组中只出现一次的数字_40 {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:array){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int flag=0;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                if(flag==0){
                    num1[0] = i;
                    flag=1;
                }
                else{
                    num2[0]=i;
                }
            }
        }
    }
}
