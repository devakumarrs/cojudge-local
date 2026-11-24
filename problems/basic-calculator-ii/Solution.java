import java.util.*;

class Solution {
    public int calculate(String s) {
        // ONE PASS SOLUTION
        Deque<Integer> stNum = new ArrayDeque<>();
        Deque<Character> stOp = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                continue;
            } else if (Character.isDigit(ch)) {
                int n = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    n = 10 * n + s.charAt(i) - '0';
                    i++;
                }
                i--;
                stNum.push(n);
            } else if (ch == '+' || ch == '-') {
                processAll(stNum, stOp);
                stOp.push(ch);
            } else {
                if (!stOp.isEmpty() && (stOp.peek() == '*' || stOp.peek() == '/')) {
                    int n2 = stNum.pop();
                    int n1 = stNum.pop();
                    int result = switch (stOp.pop()) {
                        case '*' -> n1 * n2;
                        default -> n1 / n2;
                    };
                    stNum.push(result);
                }
                stOp.push(ch);
            }
        }
        processAll(stNum, stOp);
        return stNum.pop();
    }

    private void processAll(Deque<Integer> stNum, Deque<Character> stOp) {
        while (!stOp.isEmpty()) {
            int n2 = stNum.pop();
            int n1 = stNum.pop();
            int result = switch (stOp.pop()) {
                case '+' -> n1 + n2;
                case '-' -> n1 - n2;
                case '*' -> n1 * n2;
                default -> n1 / n2;
            };
            stNum.push(result);
        }
    }
}