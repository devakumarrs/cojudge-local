import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateParenthesis(n, n, sb, result);
        return result;
    }

    private void generateParenthesis(int left, int right, StringBuilder sb, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(sb.toString());
            return;
        }
        if (left > 0) {
            sb.append('(');
            generateParenthesis(left - 1, right, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right > left) {
            sb.append(')');
            generateParenthesis(left, right - 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}