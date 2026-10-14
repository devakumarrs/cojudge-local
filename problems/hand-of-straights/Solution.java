import java.util.Map;
import java.util.TreeMap;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0)
            return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        for (int i = 0; i < n / groupSize; i++) {
            int min = map.firstKey();
            for (int j = 0, card = min; j < groupSize; j++, card++) {
                int val = map.getOrDefault(card, 0);
                if (val == 0)
                    return false;
                else if (val == 1) {
                    map.remove(card);
                } else {
                    map.put(card, val - 1);
                }
            }
        }
        return true;
    }
}