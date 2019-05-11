package newcoder_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class _难_把数组排成最小的数_32 {
	public String PrintMinNumber(int [] numbers) {
        int n;
		String s = "";				//可以改为StringBuffer,减少额外空间
		//StringBuilder s = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		n = numbers.length;									//求数组长度
		for(int i = 0; i < n; i ++){
			list.add(numbers[i]);							//将数组中数放入集合list中
		}
		Collections.sort(list,new Comparator<Integer>(){			//根据Comparable指定顺序对list集合排序
			public int compare(Integer str1,Integer str2){
				String s1 = str1 + "" + str2;				//str1和str2都是整数，用 str1 +"" + str2即将整数转化为了字符串，强！
				String s2 = str2 + "" + str1;
				return s1.compareTo(s2);					//在String中，compareTo是按照字典顺序进行比较，返回的值是一个int型，返回0，-1,1三个数字。
			}
		});
		for(int j:list){								//foreach语句
			s += j;
		}
		return s;
    }
}
