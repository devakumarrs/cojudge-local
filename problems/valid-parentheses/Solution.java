import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        Deque<Character> st = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                st.push(ch);
            } else {
                if (st.isEmpty() || map.get(ch) != st.peek()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.size() == 0;
    }
}