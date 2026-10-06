import java.util.*;

class Solution {
    public int evalRpn(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))
                    || (token.charAt(0) == '-' && token.length() > 1)) {
                int val = Integer.parseInt(token);
                stack.push(val);
                continue;
            }
            int op2 = stack.pop();
            int op1 = stack.pop();
            switch (token) {
                case "+":
                    stack.push(op1 + op2);
                    break;
                case "-":
                    stack.push(op1 - op2);
                    break;
                case "*":
                    stack.push(op1 * op2);
                    break;
                case "/":
                    stack.push(op1 / op2);
                    break;
                default:
            }
        }
        return stack.pop();
    }
}
