import java.util.Stack;

public class ValidParentheses_20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.size() > 0) {
                    if (c == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (c == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

}
