import java.util.*;

class Solution {
    private class DisjointSet {
        private int n;
        private int[] size;
        private int[] parent;


        public DisjointSet(int n) {
            this.n = n;
            size = new int[n + 1];
            Arrays.fill(size, 1);
            parent = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }

        public boolean isConnected(int n1, int n2) {
            return findUltimateParent(n1) == findUltimateParent(n2);
        }

        private int findUltimateParent(int node) {
            if (parent[node] == node)
                return node;
            return parent[node] = findUltimateParent(parent[node]);
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
    };

    public int[] findRedundantConnection(int[][] edges) {
        DisjointSet ds = new DisjointSet(edges.length);
        for (int[] edge : edges) {
            if (ds.isConnected(edge[0], edge[1])) {
                return edge;
            }
            ds.unionBySize(edge[0], edge[1]);
        }
        return new int[0];
    }
}
