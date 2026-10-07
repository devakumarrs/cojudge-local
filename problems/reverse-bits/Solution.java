public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = ((n >> i) & 1);
            result = result | (bit << (31 - i));
        }
        return result;
    }
}
