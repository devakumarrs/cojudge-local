import java.util.*;

class Solution {
    List<List<String>> results;
    List<String> result;
    boolean[][] isSubstringPalindrome;

    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        results = new ArrayList<>();

        int n = s.length();
        isSubstringPalindrome = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            isSubstringPalindrome[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;
                if (len == 2) {
                    isSubstringPalindrome[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    isSubstringPalindrome[i][j] =
                            (s.charAt(i) == s.charAt(j)) && isSubstringPalindrome[i + 1][j - 1];
                }
            }
        }

        helper(s, 0);
        return results;
    }

    private void helper(String s, int start) {
        if (start == s.length()) {
            results.add(new ArrayList<>(result));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isSubstringPalindrome[start][i]) {
                result.add(s.substring(start, i + 1));
                helper(s, i + 1);
                result.remove(result.size() - 1);
            }
        }
    }

}
