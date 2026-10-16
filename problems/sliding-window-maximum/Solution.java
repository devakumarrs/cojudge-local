import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int i = 0, j = 0, r = 0;
        while (j < nums.length) {
            if (j - i + 1 > k) {
                if (!dq.isEmpty() && dq.peekFirst() == i) {
                    dq.pollFirst();
                }
                i++;
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[j]) {
                dq.pollLast();
            }
            dq.offerLast(j);
            if (j - i + 1 == k) {
                result[r++] = nums[dq.peekFirst()];
            }
            j++;
        }
        return result;
    }
}