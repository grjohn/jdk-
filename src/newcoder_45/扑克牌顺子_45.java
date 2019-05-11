package newcoder_45;

import java.util.HashSet;
import java.util.Set;

public class 扑克牌顺子_45 {
	public boolean isContinuous(int [] numbers) {
        if(numbers==null || numbers.length<5) return false;
        Set<Integer> set = new HashSet<>();
        int max = -1;int min = 20;
        for(int i:numbers){
            if(set.contains(i)) return false;
            if(i!=0){
                set.add(i);
                if(i>max) max=i;
                if(i<min) min=i;
            }
        }
        if(max-min<=4) return true;
        return false;
    }
}
