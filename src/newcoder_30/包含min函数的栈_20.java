package newcoder_30;

import java.util.Stack;

public class 包含min函数的栈_20 {
	public Stack<Integer> data = new Stack<Integer>();
    public Stack<Integer> sup = new Stack<Integer>();
    
    public void push(int node) {
        data.push(node);
        if(sup.size()==0){
            sup.push(node);
        }
        else{
            if(sup.peek()>=node){
                sup.push(node);
            }
        }
    }
    
    public void pop() {
        if(data.peek()==sup.peek()){
            sup.pop();
        }
        data.pop();
    }
    
    public int top() {
        return data.peek();
    }
    
    public int min() {
        return sup.peek();
    }
}
