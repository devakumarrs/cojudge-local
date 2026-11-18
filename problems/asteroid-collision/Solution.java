import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int ast : asteroids) {
            if (st.isEmpty() || st.peek() < 0 || ast > 0) {
                st.push(ast);
                continue;
            }
            while (!st.isEmpty() && st.peek() > 0 && st.peek() < -ast) {
                st.pop();
            }
            if (st.isEmpty() || st.peek() < 0) {
                st.push(ast);
            } else if (st.peek() == -ast) {
                st.pop();
            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}