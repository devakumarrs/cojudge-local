import java.util.*;

class Solution {
    public int[] runMinStack(String[] operations, int[] values) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            int val = values[i];
            if (op.equals("push")) {
                stack.push(val);
                if (minStack.isEmpty() || minStack.peek() > val) {
                    minStack.push(val);
                } else {
                    minStack.push(minStack.peek());
                }
            } else if (op.equals("pop")) {
                stack.pop();
                minStack.pop();
            } else if (op.equals("top")) {
                result.add(stack.peek());
            } else {
                result.add(minStack.peek());
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
