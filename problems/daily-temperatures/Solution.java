import java.util.*;

class Solution {
    /*
     * public int[] dailyTemperatures(int[] temps) {
     * Deque<Integer> st = new ArrayDeque<>();
     * int n = temps.length;
     * int[] result = new int[n];
     * for (int i = n - 1; i >= 0; i--) {
     * while (!st.isEmpty() && temps[st.peek()] <= temps[i]) {
     * st.pop();
     * }
     * result[i] = st.isEmpty() ? 0 : st.peek() - i;
     * st.push(i);
     * }
     * return result;
     * }
     */
    public int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] result = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temps[st.peek()] < temps[i]) {
                int cold = st.pop();
                result[cold] = i - cold;
            }
            st.push(i);
        }
        return result;
    }
}