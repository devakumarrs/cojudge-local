import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.add(stone);
        }
        while (!pq.isEmpty()) {
            int h = pq.poll();
            if (pq.isEmpty()) {
                return h;
            }
            int l = pq.poll();
            if (h != l) {
                pq.offer(h - l);
            }
        }
        return 0;
    }
}