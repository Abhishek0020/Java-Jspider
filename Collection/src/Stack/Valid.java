package Stack;

import java.util.Stack;

public class Valid {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isBalanced(s));
    }
    public static boolean isBalanced(String s) {
    	Stack<Character>stack=new Stack<Character>();
    	for(int i=0;i<s.length();i++) {
    	char ch1=s.charAt(i);
    	if(ch1=='{'||ch1=='['||ch1=='(') {
    		stack.push(ch1);
    		
    	}
    	else if (ch1=='}'||ch1==']'||ch1==')') {
    		char ch2=stack.pop();
    		if(!Pair(ch1,ch2)) 
    			return false;
    	else
    	{
    		return false;
    	}
		}
    	}
		return stack.isEmpty();
    	
    }
    public static boolean Pair(char ch1,char ch2) {
    	if(ch1=='{' && ch2=='}'|| ch1=='['&& ch2==']'||ch1=='('&& ch2==')') 
    		return true;
    	
    	else 
    		return false;
    }
}