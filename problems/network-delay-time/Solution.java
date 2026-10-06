import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        k = k - 1;
        List<List<int[]>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] time : times) {
            int u = time[0] - 1;
            int v = time[1] - 1;
            int w = time[2];
            adj.get(u).add(new int[] { v, w });
        }
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        minHeap.offer(new int[] { k, 0 });
        while (!minHeap.isEmpty()) {
            int[] pair = minHeap.poll();
            int node = pair[0];
            int distanceFromK = pair[1];
            if (dist[node] < distanceFromK) {
                continue;
            }
            for (int[] neiPair : adj.get(node)) {
                int nei = neiPair[0];
                int wt = neiPair[1];
                if (dist[node] + wt < dist[nei]) {
                    dist[nei] = dist[node] + wt;
                    minHeap.offer(new int[] { nei, dist[nei] });
                }
            }
        }

        int max = dist[0];
        for (int i = 1; i < n; i++) {
            if (dist[i] > max) {
                max = dist[i];
            }
        }
        return max == Integer.MAX_VALUE ? -1 : max;
    }
}