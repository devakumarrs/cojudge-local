import java.util.*;

class Solution {
    private record Pair<K, V>(K val, V t) {
    };

    public List<String> runTimeMap(String[] operations, String[] keys, String[] values,
            int[] timestamps) {
        Map<String, List<Pair<String, Integer>>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            String key = keys[i];
            String val = values[i];
            int t = timestamps[i];
            if (op.equals("set")) {
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(val, t));
            } else if (!map.containsKey(key)) {
                result.add("");
            } else {
                result.add(binarySearch(map.get(key), t));
            }
        }
        return result;
    }

    private String binarySearch(List<Pair<String, Integer>> list, int t) {
        int low = 0, high = list.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            var midPair = list.get(mid);
            if (midPair.t == t) {
                return midPair.val;
            } else if (t > midPair.t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high >= 0 && high < list.size() ? list.get(high).val : "";
    }
}
