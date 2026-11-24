import java.util.*;

class Solution {
    public int calculate(String s) {
        s = convertToPostFix(s);
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ',') {
                continue;
            } else if (Character.isDigit(ch)) {
                int n = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    n = 10 * n + s.charAt(i) - '0';
                    i++;
                }
                i--;
                st.push(n);
            } else {
                int num2 = st.pop();
                int num1 = st.pop();
                int result = switch (ch) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    default -> num1 / num2;
                };
                st.push(result);
            }
        }
        return st.pop();
    }

    private String convertToPostFix(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> st = new ArrayDeque<>();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                i++;
            } else if (Character.isDigit(ch)) {
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;
                }
                sb.append(',');
            } else if (ch == '+' || ch == '-') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                st.push(ch);
                i++;
            } else {
                if (!st.isEmpty() && (st.peek() == '*' || st.peek() == '/')) {
                    sb.append(st.pop());
                }
                st.push(ch);
                i++;
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}