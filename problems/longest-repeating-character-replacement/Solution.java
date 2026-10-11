class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int i = 0, j = 0;
        int maxLen = 0, freq = 0;
        while (j < s.length()) {
            int index = s.charAt(j) - 'A';
            map[index]++;
            if (map[index] > freq) {
                freq = map[index];
            }
            while (j - i + 1 - freq > k) {
                map[s.charAt(i) - 'A']--;
                freq = getFreq(map);
                i++;
            }
            if (j - i + 1 > maxLen) {
                maxLen = j - i + 1;
            }
            j++;
        }
        return maxLen;
    }

    private int getFreq(int[] arr) {
        int freq = 0;
        for (int e : arr) {
            if (e > freq) {
                freq = e;
            }
        }
        return freq;
    }
}
