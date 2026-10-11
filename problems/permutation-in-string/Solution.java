class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        int[] orig = new int[26];
        for (char ch : s1.toCharArray()) {
            orig[ch - 'a']++;
        }
        int[] copy = new int[26];
        int i = 0, j = 0;
        while (j < s2.length()) {
            int index = s2.charAt(j) - 'a';
            copy[index]++;
            while (copy[index] > orig[index]) {
                int left = s2.charAt(i) - 'a';
                copy[left]--;
                i++;
            }
            if (j - i + 1 == s1.length()) {
                return true;
            }
            j++;
        }
        return false;
    }
}
