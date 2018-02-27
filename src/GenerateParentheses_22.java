import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(n, n, result, "");
        return result;
    }

    public void helper(int left, int right, List<String> result, String temp) {
        if (left == 0 && right == 0) {
            result.add(temp);
        } else {
            if (left > 0) {
                helper(left - 1, right, result, temp + "(");
            }
            if (right > left) {
                helper(left, right - 1, result, temp + ")");
            }
        }
    }
}
