class Solution {
    public int maxProfit(int[] prices) {
        int profMax = 0;
        int priceMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < priceMin) {
                priceMin = prices[i];
            } else if (prices[i] - priceMin > profMax) {
                profMax = prices[i] - priceMin;
            }
        }
        return profMax;
    }
}