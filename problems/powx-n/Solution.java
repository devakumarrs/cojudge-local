class Solution {
    public String myPow(String x, int n) {
        Double xd = Double.parseDouble(x);
        return String.valueOf(myPow(xd, n));
    }

    private Double myPow(Double x, int n) {
        if (n == 0)
            return 1.0;
        if (x == 0)
            return 0.0;
        Double xx = myPow(x, n / 2);
        if (n % 2 == 0) {
            return xx * xx;
        }
        return xx * xx * (n < 0 ? 1 / x : x);
    }
}