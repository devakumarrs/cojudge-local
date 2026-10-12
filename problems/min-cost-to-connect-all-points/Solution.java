import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private class DisjointSet {
        int[] size;
        int[] parent;

        public DisjointSet(int n) {
            size = new int[n + 1];
            Arrays.fill(size, 1);
            parent = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }

        public void unionBySize(int n1, int n2) {
            if (isConnected(n1, n2)) {
                return;
            }
            int up1 = findUltimateParent(n1);
            int up2 = findUltimateParent(n2);
            if (size[up1] > size[up2]) {
                size[up1] += size[up2];
                parent[up2] = up1;
            } else {
                size[up2] += size[up1];
                parent[up1] = up2;
            }
        }

        public boolean isConnected(int n1, int n2) {
            return findUltimateParent(n1) == findUltimateParent(n2);
        }

        private int findUltimateParent(int node) {
            if (parent[node] == node) {
                return node;
            }
            return parent[node] = findUltimateParent(parent[node]);
        }
    };

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                edges.add(new int[] {i, j});
            }
        }
        edges.sort((arr1, arr2) -> cost(points, arr1[0], arr1[1]) - cost(points, arr2[0], arr2[1]));
        DisjointSet ds = new DisjointSet(n);
        int val = 0;
        for (int[] edge : edges) {
            if (!ds.isConnected(edge[0], edge[1])) {
                val += cost(points, edge[0], edge[1]);
                ds.unionBySize(edge[0], edge[1]);
            }
        }
        return val;
    }

    private int cost(int[][] points, int i, int j) {
        return Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }
}
