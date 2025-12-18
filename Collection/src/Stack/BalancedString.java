package Stack;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String s = "{()}";
        System.out.println(isBalanced(s));  // Corrected method name here
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            
            // If the character is an opening bracket, push to stack
            if (ch1 == '{' || ch1 == '[' || ch1 == '(') {
                stack.push(ch1);
            }
            // If it's a closing bracket, check if it matches with the top of the stack
            else if (ch1 == '}' || ch1 == ']' || ch1 == ')') {
                if (!stack.isEmpty()) {
                    char ch2 = stack.pop();
                    if (!pair(ch2, ch1)) {
                        return false;
                    }
                } else {
                    return false;  // If stack is empty and closing bracket appears, it's unbalanced
                }
            }
        }
        return stack.isEmpty();  // If stack is empty at the end, it is balanced
    }

    public static boolean pair(char ch2, char ch1) {
        return (ch1 == '}' && ch2 == '{') || (ch1 == ']' && ch2 == '[') || (ch1 == ')' && ch2 == '(');
    }
}
