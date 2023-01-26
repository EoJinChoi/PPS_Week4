package Solution;

import java.util.Stack;

public class Solution { // 20230116
	public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb= new  StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
        	if(!stack.empty() && stack.peek() == s.charAt(i)) {
        		stack.pop();
        		continue;
        	}
        	stack.push(s.charAt(i));
        }
        
        while(!stack.empty()) {
        	sb.append(stack.pop());
        }
        
        String result = String.valueOf(sb.reverse());
//        System.out.println(result);
        return result;
    }
}
