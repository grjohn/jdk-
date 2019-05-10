package newcoder_15;

import java.util.Stack;

public class 两个栈实现队列_5 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        int size = stack1.size();
        for(int i=0;i<size;i++){
            stack2.push(stack1.pop());
        }
        int tem = stack2.pop();
        for(int i=0;i<size-1;i++){
            stack1.push(stack2.pop());
        }
        return tem;
    }
}
