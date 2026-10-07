class Solution {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        int sign = x < 0 ? -1 : 1;
        String s = String.valueOf(x);
        if (s.charAt(0) == '-') {
            s = s.substring(1);
        }
        char[] chArr = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            char temp = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = temp;
        }
        String r = new String(chArr);
        int k = 0;
        while (k < r.length() && r.charAt(k) == '0') {
            k++;
        }
        String f = r.substring(k);
        long val = Long.parseLong(f) * sign;
        if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) val;
    }
}
