package newcoder_30;

import java.util.Stack;

public class _难_栈的压入压出弹出序列_21 {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      Stack<Integer> stack = new Stack();
	        int popIndex = 0;
	        for(int i=0;i<pushA.length;i++){
	            stack.push(pushA[i]);
	            while(stack.size()!=0 && stack.peek()==popA[popIndex]){
	                stack.pop();
	                popIndex++;
	            }
	        }
	        if(stack.size()==0) return true;
	        return false;
	    }
}
