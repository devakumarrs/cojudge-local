import java.util.*;

class Solution {
    List<List<String>> results;
    List<String> result;

    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        results = new ArrayList<>();
        helper(s, 0);
        return results;
    }

    private void helper(String s, int start) {
        if (start == s.length()) {
            results.add(new ArrayList<>(result));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                result.add(s.substring(start, i + 1));
                helper(s, i + 1);
                result.remove(result.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
