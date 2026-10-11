import java.util.*;

class Solution {
    public int[] kthLargestStream(int k, int[] nums, int[] additions) {
        int[] result = new int[additions.length];
        int i = 0, j = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        while (i < nums.length) {
            if (pq.size() < k) {
                pq.offer(nums[i]);
            } else if (pq.peek() < nums[i]) {
                pq.poll();
                pq.offer(nums[i]);
            }
            i++;
        }
        while (i < nums.length + additions.length) {
            int val = additions[i - nums.length];
            if (pq.size() < k) {
                pq.offer(val);
            } else if (pq.peek() < val) {
                pq.poll();
                pq.offer(val);
            }
            result[j++] = pq.peek();
            i++;
        }
        return result;
    }
}
