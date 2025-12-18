package Stack;

import java.util.Stack;

public class BalencedStr {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isBalanced(s)); // Expected output: true
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);

            if (ch1 == '{' || ch1 == '[' || ch1 == '(')
            {
                stack.push(ch1);
            }
            else if (ch1 == '}' || ch1 == ']' || ch1 == ')') 
            {
                if (!stack.isEmpty())
                {
                    char ch2 = stack.pop();
                    if (!pair(ch2, ch1)) {
                        return false;
                    }
                } 
                else 
                {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // Ensures no unmatched opening brackets remain
    }

    public static boolean pair(char ch1, char ch2) {
        return (ch1 == '{' && ch2 == '}') ||
               (ch1 == '[' && ch2 == ']') ||
               (ch1 == '(' && ch2 == ')');
    }
}

