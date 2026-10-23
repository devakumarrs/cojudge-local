import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Queue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (var entry : map.entrySet()) {
            int[] arr = new int[] { entry.getKey(), entry.getValue() };
            if (q.size() < k) {
                q.offer(arr);
            } else if (q.peek()[1] < arr[1]) {
                q.poll();
                q.offer(arr);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = q.poll()[0];
        }
        return result;
    }
}