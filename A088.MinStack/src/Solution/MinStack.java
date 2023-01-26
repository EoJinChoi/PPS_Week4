package Solution;

import java.util.Stack;

public class MinStack { // 20230120
	Stack<Integer> stack;
	
	public MinStack() {
        stack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return(stack.peek());
    }
    
    public int getMin() {
        int min = stack.get(0);
        for(int i = 1; i < stack.size(); i++) {
        	if(stack.get(i) < min) min = stack.get(i);
        }
        return min;
    }
}
