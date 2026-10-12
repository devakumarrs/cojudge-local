import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private class DisjointSet {
        int[] size;
        int[] parent;

        public DisjointSet(int n) {
            size = new int[n];
            Arrays.fill(size, 1);
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public boolean unionBySize(int n1, int n2) {
            int up1 = findUltimateParent(n1);
            int up2 = findUltimateParent(n2);
            if (up1 == up2)
                return false;
            if (size[up1] > size[up2]) {
                size[up1] += size[up2];
                parent[up2] = up1;
            } else {
                size[up2] += size[up1];
                parent[up1] = up2;
            }
            return true;
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
        List<int[]> edges = new ArrayList<>((n * (n - 1)) / 2);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int cost = Math.abs(points[i][0] - points[j][0])
                        + Math.abs(points[i][1] - points[j][1]);
                edges.add(new int[] {i, j, cost});
            }
        }
        edges.sort((arr1, arr2) -> Integer.compare(arr1[2], arr2[2]));
        DisjointSet ds = new DisjointSet(n);
        int minCost = 0, edgeCount = 0;
        for (int[] edge : edges) {
            if (ds.unionBySize(edge[0], edge[1])) {
                minCost += edge[2];
                edgeCount++;
                if (edgeCount == n - 1)
                    break;
            }
        }
        return minCost;
    }
}
