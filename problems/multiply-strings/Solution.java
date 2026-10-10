class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length(), n = num2.length();
        StringBuilder result = new StringBuilder();
        for (int i = m - 1, r = 0; i >= 0; i--, r++) {
            int n1 = num1.charAt(i) - '0';
            int currentCarry = 0, existingDigit = 0;
            int k = r;
            for (int j = n - 1; j >= 0; j--, k++) {
                int n2 = num2.charAt(j) - '0';
                existingDigit = k >= result.length() ? 0 : result.charAt(k) - '0';
                int val = n1 * n2 + existingDigit + currentCarry;
                currentCarry = val / 10;
                char digit = (char) (val % 10 + '0');
                if (k < result.length()) {
                    result.setCharAt(k, digit);
                } else {
                    result.append(digit);
                }
            }
            if (currentCarry != 0) {
                result.append((char) (currentCarry % 10 + '0'));
            }
        }
        return result.reverse().toString();
    }
}