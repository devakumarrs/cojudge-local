import java.util.*;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (high < piles[i]) {
                high = piles[i];
            }
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int actualHours = 0;
            for (int pile : piles) {
                actualHours += Math.ceil((pile * 1.0) / mid);
            }
            if (actualHours > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}