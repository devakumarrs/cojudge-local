class Solution {
    public int countSubstrings(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            len += countPalindromes(s, i, i);
            len += countPalindromes(s, i, i + 1);
        }
        return len;
    }

    private int countPalindromes(String s, int i, int j) {
        int count = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
        return count;
    }
}