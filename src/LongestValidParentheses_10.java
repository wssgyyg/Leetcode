import java.util.Stack;

public class LongestValidParentheses_10 {

    public int longestValidParentheses(String s) {
        int max = 0;
        int left = -1;
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    left = i;
                } else {
                    stack.pop();
                    if (stack.empty()) max = Math.max(i - left, max);
                    else max = Math.max(i - stack.peek(), max);
                }
            }
        }

        return max;
    }

    /**
     * dp[i] represents the longest length for the substring ended at index i;
     */
    public int longestValidParenthesesDP(String s) {
        int[] dp = new int[s.length()];
        int curMax = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = i >= 2 ? dp[i - 2] + 2 : 2;
                    curMax = Math.max(curMax, dp[i]);
                } else {
                    if (i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        dp[i] = dp[i - 1] + 2 + ((i - dp[i - 1] - 2) >= 0 ? dp[i - dp[i - 1] - 2] : 0);
                        curMax = Math.max(curMax, dp[i]);
                    }
                }
            }
        }
        return curMax;
    }

}
